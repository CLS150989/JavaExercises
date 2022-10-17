public class Organ {

    private String name;
    private String medicalCondition;



    //constructor
    public Organ (String name, String medicalCondition){
        this.name = name;
        this.medicalCondition = medicalCondition;

    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setMedicalCondition(String medicalCondition){
        this.medicalCondition = medicalCondition;
    }

    //getters

    public String getName() {
        return name;
    }

    public String getMedicalCondition(){
        return medicalCondition;
    }

    //Methods
    public void getDetails (){
        System.out.println("Name" + this.getName());
        System.out.println("Medical Condition: "+ this.medicalCondition);
    }








}
