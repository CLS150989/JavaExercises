public class ElectricCar implements CarInterface {


    //properties
    private String name;

    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


   // Constructor
    public ElectricCar(String name) {
        this.name = name;
    }



    // methods from interface
    @Override
    public void printName(String name) {

    }

    @Override
    public void start() {
        System.out.println("Electric flow started");

    }

    @Override
    public void move (int speed) {
        System.out.println(this.getName() + "moves at " + speed + " mph" );
    }
}
