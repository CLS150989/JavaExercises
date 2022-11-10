import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//global variables that need access to multiple methods within the main class
    private static ArrayList<Contacts>  contacts;
    private static Scanner scanner;
    private static int id = 0;


    public static void main(String[] args) {

        contacts = new ArrayList<>();
        System.out.println("Welcome to my humble world of programming");
        showInitialOptions();


    }



    //void doesn't require a return statement
    private static void showInitialOptions(){
        System.out.println("Select one option:" +
                "\n\t1. Manage Contacts"+
                "\n\t2. Messages" +
                "\n\t3. Quit");

        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            default:
                break;

        }

    }

    private static void manageMessages() {
        System.out.println("Select one option" +
                "\n\t1. Show all messages" +
                "\n\t2. Send a new message" +
                "\n\t3. Go Back");

        int choice = scanner.nextInt();


    switch (choice) {

        case 1:
            showALlMessages();
            break;
        case 2:
            sendNewMessage();
            break;
        default:
            showInitialOptions();
            break;


}

    }

    private static void sendNewMessage() {
        System.out.println("Who are you going to send the message?");
        String name = scanner.next();

        if (name.equals("")) {
            System.out.println("No empty name alloud");
            sendNewMessage();
        }else {
            boolean doesExist = false;
            for (Contacts c : contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }

            String text = null;

            if (doesExist) {
                System.out.println("what are you going to say?");
                text = scanner.next();
                if (text.equals("")) {
                    System.out.println("please enter text");
                    sendNewMessage();
                } else {
                    id++;
                    Message nweMessage = new Message(text, name, id);
                    for (Contacts c : contacts) {
                        if (c.getName().equals(name)) {
                            ArrayList<Message> newMessages = c.getMessages();
                            newMessages.add(nweMessage);
                            Contacts currentContact = c;
                            currentContact.setMessages(newMessages);
                            contacts.remove(c);
                            contacts.add(currentContact);
                        }
                    }
                }
            } else {
                System.out.println("theere is not such contact");
            }
        }
        showInitialOptions();
    }







    private static void showALlMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();
        for (Contacts c: contacts){
            allMessages.addAll(c.getMessages());
        }
        if (allMessages.size()>0){
            for(Message m: allMessages){
                m.getDetails();
                System.out.println("****************************");
            }
        } else {
            System.out.println("you don't have any message");
        }


    }


    private static void manageContacts(){
    System.out.println("Select an option: "
    + "\n\t1. Show all contacts"+
            "\n\t2. Add contact"+
            "\n\t3. Search for a contact"+
            "\n\t4 Delete a contact" +
            "\n\t4 Go Back");

    int choice = scanner.nextInt();
    switch (choice) {
        case 1:
            showAllContacts();
            break;
        case 2:
            addNewContacts();
            break;
        case 3:
            searchForContacts();
            break;
        case 4:
            deleteContacts();
            break;
        default:
            showInitialOptions();
            break;
    }

}

    private static void deleteContacts() {
        System.out.println("Which contact do you want to delete?");
        String name = scanner.next();

        if (name.equals("")) {
            System.out.println("No empty name aloud");
            deleteContacts();
        }else{
            boolean doesExist = false;
            for (Contacts c: contacts){
                if (name.equals(c.getName())){
                    doesExist = true;

                    //you have to remove the contact from the array list
                    contacts.remove(c);

                }
            }
            if (!doesExist) {
                System.out.println("no such contact in your contat's list");
            }
        }
      showInitialOptions();

    }

    private static void searchForContacts() {
        System.out.println("Enter the contact name: ");
        String name = scanner.next();

        if (name.equals("")) {
            System.out.println("Please enter the name");
            searchForContacts();
        }else {
            boolean doesExist = false;
            for (Contacts c: contacts){
                if (name.equals(c.getName())){
                    doesExist = true;
                    c.getDetails();
                }
            }

            //if dosExist is not equal to true...
            if (!doesExist){
                System.out.println("there is no such contact");
            }
        }
        showInitialOptions();
    }





    private static void addNewContacts() {

        //reading the name of the contact
        System.out.println("Adding a new contact..." +
                "\nEnter the name of the new contact");
        String name = scanner.next();

        //reading the number of the contact
        System.out.println("Enter the number of the new contact: ");
        String number = scanner.next();

        //reading the email
        System.out.println("Enter the Email of the new Contact");
        String email = scanner.next();

        if(name.equals("") || number.equals("") || email.equals("")){
            System.out.println("enter all the information");
            addNewContacts();
        }else {

            boolean doesExist = false;

            for (Contacts c : contacts){
                if (name.equals(c.getName())){
                    doesExist = true;
                }
            }
            //doeExist is true
           if (doesExist){
               System.out.println("We have a contact named" + name + "on this device");
               addNewContacts();
            } else {
               Contacts contact = new Contacts(name,number,email); //constructing the new contact with the information introduced by the user
               contacts.add(contact);
               System.out.println(name + "added successfully");
           }
        }
        showInitialOptions();
    }




    private static void showAllContacts() {
         for (Contacts c: contacts ){
          c.getDetails();
             System.out.println("******************************");
           }
      showInitialOptions();

    }






}
