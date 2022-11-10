public class Bird extends Animal {


    private int wings;

//constructor
    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }


//setter for attribute wing
public void setWings(int wings){
        this.wings = wings;
     }


//getter for attribute wing
public int getWings(){
        return wings;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("eating finished");
    }

    public void fly() {
        System.out.println(this.getName() + " is flying");
    }

    public void fly(int speed){

        }



    /*

    private String name;
    private String color;
    private int legs;
    private boolean hasTale;

//constructor
    public bird(String name, String color, int legs, boolean hasTale) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTale = hasTale;
    }

    //methods

    public void eat(String food){
        System.out.println("eating" + food);
    }



    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }
    public  void setHasTale(boolean hasTale){
        this.hasTale = hasTale;
    }


    //getters
    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }
    public boolean isHasTale() {
        return hasTale;
    }

    public  int getLegs(){
        return legs;
    }

*/

}
