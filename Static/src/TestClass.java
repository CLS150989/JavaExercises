public class TestClass {
    //public variables belong to the object self and not the instances of it
    public static String  name;
    public int age;
    public String skinColor;

    public TestClass(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

//   defining a static method in our class
    public  static void printSomething(){
        System.out.println("I´m Chara´s best friend");
    }


}
