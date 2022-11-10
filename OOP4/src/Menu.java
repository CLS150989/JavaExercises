import java.util.Scanner;

public class Menu {


    public void displayMenu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an organ: \" + \n" +
                " \"1. Left eye\" +\n" +
                " \"2. Right eye\" +\n" +
                " \"3. Hearth\" +\n" +
                " \"4. Skin\" +\n" +
                " \"5. Quit");
        int PatientChoise = scanner.nextInt();

        while (PatientChoise != 5){
            if(PatientChoise == 1){
                LeftEye leftEye = new LeftEye();
                leftEye.closeEye();
            } else if (PatientChoise == 2) {
                RightEye rightEye = new RightEye();
                rightEye.closeEye();
            } else if (PatientChoise == 3) {
                Heart heart = new Heart();
                heart.HearthCondition();

            } else if (PatientChoise == 4) {


            }  System.out.println("Choose an organ: \" + \n" +
                    " \"1. Left eye\" +\n" +
                    " \"2. Right eye\" +\n" +
                    " \"3. Hearth\" +\n" +
                    " \"4. Skin\" +\n" +
                    " \"5. Quit");
             PatientChoise = scanner.nextInt();




        }


    }
}
