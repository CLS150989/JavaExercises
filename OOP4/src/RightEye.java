import java.util.Scanner;

public class RightEye {


    public  void closeEye(){
        System.out.println(" 1. CLose the Eye");
        Scanner scanner = new Scanner(System.in);
        int ClosingEye = scanner.nextInt();
        if (ClosingEye == 1){
            System.out.println("right eye closed");

        }else{
            Menu menu = new Menu();
            menu.displayMenu();

        }

    }



}
