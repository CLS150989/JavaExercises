public class FossilFuelCar implements CarInterface {

    //properties
    private  String name;



    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //constructor
    public FossilFuelCar(String name) {
        this.name = name;
    }




    // Methods from Interface
    @Override
    public void printName(String name) {

    }

    @Override
    public void start() {
        System.out.println("Explosion in cylinder causes the engine to start");

    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " moves at: " + speed  + " mph" );

    }
}
