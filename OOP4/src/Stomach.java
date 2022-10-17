public class Stomach extends Organ{
    private boolean isEmpty;


    //Constructor
    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;

    }


    //Gettere
    public boolean isEmpty() {
        return isEmpty;
    }

    //Setters
    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

   //Methods


    @Override
    public void getDetails() {
        super.getDetails();
        if(this.isEmpty()){
            System.out.println("Need to be fed");
        }else {
            System.out.println("stomach full");
        }
    }


    public void digest(){
        System.out.println("Digest beginns...");
    }




}
