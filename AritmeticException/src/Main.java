import com.sun.source.tree.CompoundAssignmentTree;

public class Main {
    public static void main(String[] args) {
        //Aritmethic exception

        int a = 2;
        int b = 0;


        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("not allowed division between zero");
        }


        String name = null;


        //null pointer exception
        try {
            name.equals("Chara");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("not equal");
        }



    }
}