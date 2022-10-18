public class Main {
    public static void main(String[] args) {

        //you can assign a value to a property before instantiating
        // the object with static variables
        TestClass.name = "Punky";
        TestClass testClass = new TestClass(25, "White");

        System.out.println("name: " + testClass.getName());

        // everey instantiated object will remain with te same value of the static property

        TestClass SecondTestClass = new TestClass(10, "PELUDO");
//      System.out.println("name: " + SecondTestClass.getName());
        System.out.println("age: "+
                SecondTestClass.getAge() +  "\nskin color: "
                + SecondTestClass.getSkinColor() +
                "\nname: " + SecondTestClass.getName());

// static methods get active within the class self and not the instantiated object
        TestClass.printSomething();  //apply directly to the class

    }
}
