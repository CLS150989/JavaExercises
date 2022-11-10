public class constructorMain {
    public static void main(String[] args) {


        //Instantiating  phone object with constructor
        Phone punnkysPhone = new Phone("punkys phone", 4, 4, 2);
        ////applying herMusic method
        punnkysPhone.hearMusic("soy un gran cantante", "nudos hits");
        System.out.println(punnkysPhone.name);



        //Instantiating another phone object with constructor
        Phone charasPhone = new Phone("charas phone", 4);
        //applying herMusic method
        charasPhone.hearMusic("kofsuda's song", "kofs hits" );
        System.out.println(charasPhone.name);
    }

}
