import java.util.Random;
import java.util.Scanner;

public class loops{

    public static void main(String[] args) {
        int a = 10;

        for(int i = 0; i <10; i++){
            System.out.println("chara");
        }



        for(int i = 0; i<a; i++) {
            System.out.println("chara y nudo");

        }
     int i = 0;
     while (i <= 10 ){
         if (i ==8){
             System.out.println("chara, nudo, chico y kof");
         }
         if(i ==9){
             System.out.println("chara, nudo, chido, kof y perra");
         }
         if(i==10){
             System.out.println("nichts mehr zum Ausdrucken");
         }
         System.out.println("nudo chara y kof");
         i++;
         System.out.println(i);

     }
     //retrieving user input
     //first create the scanner object:
      Scanner scanner = new Scanner(System.in);


        System.out.println("enter a number");
        int number = scanner.nextInt();
        System.out.println("the number is: "+ number);


    //retrieving the name of a user
        System.out.println("enter your name: ");
        String name = scanner.next();
        System.out.println("hello " + name);



        // retrieving a random number
        Random random;
        random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("your random number is: "+ randomNumber);


    }
}