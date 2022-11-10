public class Phone {
    String name;
    int screenSize;
    int memoryRam;
    int camera;

    //POLIMORPHISM is the capacity to have differente type of constructors in a programmign language
    //constructor 1
    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }
//construnctor 2
    public Phone(String name, int memoryRam){
        this.name = name;
        this.memoryRam = memoryRam;
    }

//setters
    public void setName(String name) {
        this.name = name;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public String getName() {
        return this.name;
    }
//getters
    public int getCamera() {
        return this.camera;
    }

    public int getMemoryRam() {
        return this.memoryRam;
    }

    public int getScreenSize() {
        return this.screenSize;
    }

    public void hearMusic(String trackName, String albumName){
        System.out.println("escuchando "+ trackName);
        System.out.println("album" + albumName);

    }


}


