public class TestClass {

    //properties of the parent class
    private int age;
    private String color;



    private  class TestInnerClass{

        private String name;

        public TestInnerClass(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public String getName() {
            return name;
        }

        //you can have access to the properties of the parent class
        // within a method of the inner class
       private void printAge() {
           System.out.println("Age: " + age);

       }




    }




}
