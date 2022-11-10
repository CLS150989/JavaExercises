public class Car {
    private String name;
    private int doors;
    private String color;
    private Engine engine;

    //constructor
    public Car(String name, int doors, String color, Engine engine){
        this.color = color;
        this.doors = doors;
        this.name = name;
        this.engine = engine;
    }


    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    //getters
    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }
}
