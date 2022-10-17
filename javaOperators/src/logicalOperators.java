public class logicalOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        /**
        a = a +2;
        a++;
        a+=1;
        a--;
        a /= 2;
         **/
/**
        //comparison operators
        boolean answer = a>b;
        System.out.println(answer);

        boolean answerFalse = a<b;
        System.out.println(answerFalse);

        boolean answer3 = a==b;
        System.out.println(answer3);

        boolean answer4 = a >= b;
        System.out.println(answer4);

        boolean answer5 = a <= b;
        System.out.println(answer5);

        boolean answer6 = a != b;
        System.out.println(answer6);

        //logical operators

        boolean answer7 = a==5 || b==2; // 'or' operator only one must be true
        System.out.println(answer7);

        boolean answer8 = a==5 && b==2; // 'and' operator both must bue true
        System.out.println(answer8);





        // conditional statements
        if (a>b) {
            System.out.println("a es greater than b"); //java requires double quotation
        } else {
            System.out.println("A is less than B");
        }
      **/


        /**
        if (a>0) {
            System.out.println("A is positive");
        }
               else if (a<0)
               {
                System.out.println("ais negative");
            }
            else
            {
                System.out.println("a is zero");
            }
        }
              **/


        //switch  statements
    switch (a) {
        case 1:
            System.out.println("a is one");
            break;
        case 2:
            System.out.println("A is two");
            break;

        case 3:
            System.out.println("a is three");
            break;
        default:
            System.out.println(("A is not one, two or three"));
            break;
    }




    }
}