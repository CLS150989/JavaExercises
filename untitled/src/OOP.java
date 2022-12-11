public class OOP {
    public static void main(String[] args) {

        Phone punkysPhone = new Phone();
        punkysPhone.setName("punkys phone");
        punkysPhone.setMemoryRam(2);
        punkysPhone.playMusic("soy un gran cantante", "nudo's hits");
        System.out.println(punkysPhone.getName());
        System.out.println(punkysPhone.getName());

        System.out.println("-----------------------------------------------------");

        Phone charasAndroid = new Phone();
        charasAndroid.setMemoryRam(4);
        charasAndroid.playMusic("kofsuda's song", "kof's hits" );
        charasAndroid.setName("charas phone");
        System.out.println(charasAndroid.getName());
        System.out.println(charasAndroid.getMemoryRam());


    }
}
