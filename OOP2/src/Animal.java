public class Animal {
    private String name;
    private String color;
    private int legs;
    private boolean hasTale;


    //constructor
    public Animal(String name, String color, int legs, boolean hasTale){
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTale = hasTale;
    }

    //method
    public void eat(String food){
        System.out.println("eating: " + food);
    }

    //setters
    public void setColor(String color){
        this.color=color;
    }
    public void  setLegs(int legs){
        this.legs = legs;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHasTale(boolean hasTale){
        this.hasTale = hasTale;
    }


    //getters
    public String getName() {
        return name;
    }
    public int getLegs() {
        return legs;
    }
    public String getColor() {
        return color;
    }
    public boolean isHasTale() {
        return hasTale;
    }

}
