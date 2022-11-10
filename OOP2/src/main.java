public class main {
    public static void main(String[] args) {

        Bird phoenix = new Bird("my_phoenix", "golden", 2, true, 2) ;
        System.out.println(phoenix.getName());
        System.out.println(phoenix.getColor());
        phoenix.eat("some worms");
        System.out.println(phoenix.getWings());
        phoenix.fly();

    }

}
