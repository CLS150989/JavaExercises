public class Phone {


//properties of my class - characteristics
  private  String name;
  private int screenSize;
  private int memoryRam ;
  private int camara;

   // methods of my class - behavior
   public void playMusic (String trackname, String albumName) {
      System.out.println("playing: "+ trackname);
      System.out.println("album: "+ albumName);
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setMemoryRam(int memoryRam) {
      this.memoryRam = memoryRam;
   }

   public int getMemoryRam() {
      return memoryRam;
   }


   public void setScreenSize(int screenSize) {
      this.screenSize = screenSize;
   }


   public int getScreenSize() {
      return screenSize;
   }
}



