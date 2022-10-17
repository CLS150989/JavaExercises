import java.util.Random;
import java.util.Scanner;

public class randomGameCorrect {
    public static void main(String[] args) {
        System.out.println("welcome to the random number game");
        System.out.println("May I have your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("hello " + name);

        System.out.println("shall we start?");
        System.out.println("\t1: yes");
        System.out.println("\t2: no");


        int beginAnswer = scanner.nextInt();


        while (beginAnswer != 1) {
            System.out.println("shall we start?");
            System.out.println("\t1: yes");
            System.out.println("\t2: no");

            beginAnswer = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(20) + 1;
        System.out.println("please guess a number: ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;


        while (!shouldFinish) {
            timesTried++;
            if (timesTried < 5) {
                if(userInput == x) {
                    hasWon = true;
                    shouldFinish=true;
                }else if (userInput > x) {
                    System.out.println("guess lower");
                    userInput = scanner.nextInt();
                }else {
                    System.out.println("guess higher");
                    userInput = scanner.nextInt();
                }

            } else {
                shouldFinish = true;
            }

        }

    if  (hasWon){
        System.out.println("congratulations, you have guessed in your "+ timesTried + "guess" );
    } else {
        System.out.println("game over");
        System.out.println("the number was: " + x);
    }
    }
}