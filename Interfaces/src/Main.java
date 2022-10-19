import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {


/**  Instantiating an interface
 CarInterface carInterface = new CarInterface() {
@Override public void printName(String name) {

}
@Override public void start() {

}
@Override public void move(int speed) {

}
};
 **/


        //Instantiating class with interface
        CarInterface carInterface = new ElectricCar("Punky´s Auto ");
        carInterface.start();
        carInterface.move(250);


        //Instantiating class with interface
        CarInterface fossilCarInterface = new FossilFuelCar("nudo´s car");
        fossilCarInterface.start();
        fossilCarInterface.move(200);

    }

}
