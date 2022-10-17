import java.security.PublicKey;

public class Eye extends Organ {  //extended class from class Organ

    private String color;
    private boolean isOpened;


    //constructor inherited from class Organ
    public Eye(String name, String medicalCondition, String color, boolean isopened) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isopened;
    }



    //setters
    public void setColor(String color){
        this.color = color;
    }

    public void setOpened(boolean opened){
        isOpened = opened;
    }

    //getters

    public String getColor() {
        return color;
    }

    public boolean isIsopened() {
        return isOpened;
    }


    //methods
    @Override   //modifying the get details method from Organ class to print color of the eye
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: "+ this.getColor());
    }

    public void open (){
        this.setOpened(true);
        System.out.println(this.getName()+ "opened");
    }

    public void close (){
        this.setOpened(false);
        System.out.println(this.getName()+ "close");
    }
}
