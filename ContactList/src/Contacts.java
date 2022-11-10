import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {


//properties

    private String name;
    private String number;
    private String email;
    private ArrayList<Message> messages;




//Constructors

    public Contacts(String name, String number, String email, ArrayList<Message> messages) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.messages = messages;
    }

    public Contacts(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.messages = new ArrayList<>();
    }

    //setters getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }


    public void getDetails(){
        System.out.println("Name: " + this.name +
        "\nnumber: "+ this.number+
         "\nemail: " + this.email +
         "\nmessages: " + this.messages );

    }



}


