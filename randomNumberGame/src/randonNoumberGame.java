
import java.util.Random;
import java.util.Scanner;

public class randonNoumberGame {
    public static void main(String[] args) {
        // INITIALIZING OBJECT´S SCANNER, RANDOM OBJECT  AND CONTROL VARIABLE
        Random randomNumber;
         randomNumber =new Random();

        int i = 1;


        //INITIALIZING USER INPUT SCANNER
        Scanner scanner;
        scanner = new Scanner(System.in);

        // GIVING A WELCOME MESSAGE TO THE PLAYER
        System.out.println(" Welcome to the RANDOM NUMBER GAME ");

        // READING AND SAYING HI THE PLAYER
        System.out.println("Write your name please");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);



       //possible user entries for the logic of the game
        String positiveAnswer = "yes";
        String negativeAnswer = "no";
        int x = randomNumber.nextInt( 1, 20 )+1;


        //STARTING THE GAME
        System.out.println("Can we start the game?...");
        String userAnswer = scanner.nextLine();



        if (userAnswer.equals(positiveAnswer)) {{
            System.out.println("guess a random number between 1 and 20. You have 5 opportunities");
            System.out.println("try: ");
            int userNumber = scanner.nextInt();

            while (i <= 5) {


                if (userNumber == x) {
                    System.out.println("You have won!!");
                    break;

                }
                else  {
                    System.out.println("incorrect number");
                    System.out.println("try again: ");
                     userNumber = scanner.nextInt();
                }

                i++;
            }
        }
        while (userAnswer.equals(negativeAnswer)) {
            System.out.println("game over");

        }
        }
        System.out.println("the winner number was: "+ x );
        System.out.println("better luck for the next time "+ name);

    }
}




