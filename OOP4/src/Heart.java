public class Heart extends Organ {
    private int rate;

    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }


    //getters
    public int getRate() {
        return rate;
    }


    //Setters
    public void setRate(int rate) {
        this.rate = rate;
    }

    //methods

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("heart rate "+ this.getRate());
    }
}
