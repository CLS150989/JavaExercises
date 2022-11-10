public class Main {
    public static void main(String[] args) {

        Engine motor = new Engine("renault", 10000);
        Car charasAuto = new Car("charas car",7,"silver", motor);
        System.out.println(charasAuto.getColor());
        System.out.println(charasAuto.getName());
        System.out.println(charasAuto.getDoors());
        System.out.println(charasAuto.getEngine().getModel());

        // keywords:  null  (it cancels value assignments to parameters of the  instantiated objects)
        //            final (avoids changing the value of the variables)

    }
}
