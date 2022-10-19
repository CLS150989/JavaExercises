// Abstract classes do not support multiple inheritance
// Abstract classes uses keyword extends
public class TesClass extends TestAbstractClass {

//    constructor from abstract class
//    public TesClass(String name) {
//        super(name);
//    }

    @Override
    public void printName(String name) {
        System.out.println("name: " + name);
    }
}
