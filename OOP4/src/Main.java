import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //getting age and name of the patient
        System.out.println("enter your name:");
        Scanner scanner = new Scanner(System.in);
        String PatientName = scanner.nextLine();
        System.out.println("enter your age: ");
        int PatientAge = scanner.nextInt();

        //Printing the Name and the age of the patient
        System.out.println(PatientName);
        System.out.println(PatientAge);


     Menu menu = new Menu();
     menu.displayMenu();



    }
}
