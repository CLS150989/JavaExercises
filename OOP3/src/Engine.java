public class Engine {
    private String model;
    private int rpm;



    //constructor
    public Engine(String model, int rpm){
        this.model = model;
        this.rpm = rpm;
    }


    //getters
    public String getModel () {
        return model;
    }
    public int getRpm(){
        return rpm;
    }



    //setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
