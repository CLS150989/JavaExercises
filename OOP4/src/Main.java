import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("NUDERA", 28,
                new Eye("Left eye ", "short sighted",
                        "black", true ),
                new Eye("right eye", "normal", "black", true),
                new Heart("Hart", "normal", 65),
                new Stomach("stomach", "PUD", false ),
                new Skin("Skin", "burned", "white",40));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);
        boolean shouldFinish = false;

        while (!shouldFinish) {
            System.out.println("Choose an Organ: " +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3.  Heart" +
                    "\n\t4.  Stomach" +
                    "\n\t5.  Skin");
            int choise = scanner.nextInt();
        switch (choise){
            case 1:
                patient.getLeftEye().getDetails();
                if (patient.getLeftEye().isIsopened()){
                    System.out.println("\t\t1. Close the eye ");
                    if(scanner.nextInt()==1) {
                        patient.getLeftEye().close();
                    }else {
                        continue;
                    }
                }else{
                    System.out.println("\t\t1. Open the eye");
                    if (scanner.nextInt()==1){
                        patient.getLeftEye().open();
                    }
                }
                break;
            case 2:
                patient.getRightEye().getDetails();
                if (patient.getRightEye().isIsopened()){
                    System.out.println("\t\t1. Close the eye ");
                    if(scanner.nextInt()==1) {
                        patient.getRightEye().close();
                    }else {
                        continue;
                    }
                }else{
                    System.out.println("\t\t1. Open the eye");
                    if (scanner.nextInt()==1){
                        patient.getRightEye().open();
                    }
                }
                break;
            case 3:
                patient.getHeart().getDetails();
                System.out.println("\t\t1 change the heart rate: ");
                if (scanner.nextInt()==1){
                    System.out.println("Enter the new heart rate");
                    int newHeartRate = scanner.nextInt();
                    patient.getHeart().setRate(newHeartRate);
                    System.out.println("Heart rate changed to: " + patient.getHeart().getRate());

                }else {
                     continue;
                }
                break;
            case 4:
                patient.getsStomach().getDetails();
                System.out.println("\t\t Digest ");
                if(scanner.nextInt()== 1){
                    patient.getsStomach().digest();
                }else {
                    continue;
                }
                break;
            case 5:
                patient.getSkin().getDetails();
                break;
            default:
                shouldFinish = true;
        }



        }

    }



}
