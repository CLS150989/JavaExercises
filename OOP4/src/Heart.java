import java.util.Scanner;

public class Heart {

    public void HearthCondition(){

        //introducing the heart rate
        System.out.println("1. Change heart rate");
        Scanner scanner = new Scanner(System.in);
        int HeartScanner = scanner.nextInt();


        if (HeartScanner == 1){
            System.out.println("enter the new heart rate");
            int heartRate = scanner.nextInt();
            System.out.println("The new heart rate is: "+ heartRate);
            if (heartRate ==80 ) {
                System.out.println("normal heart rate no medicament needed");
            }else if (heartRate <65 ) {
                System.out.println("critical condition medical attendance needed");
            }
            else if (heartRate>120) {
                System.out.println("critical condition  medicament needed");

            } else if (heartRate < 100) {
                System.out.println("normal heart condition");

            }
        } else {
            Menu menu = new Menu();
            menu.displayMenu();

        }

    }
}
