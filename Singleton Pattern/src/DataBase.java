public class DataBase {

    private String name;
    private static DataBase instance;





//getInstance method  synchronized key word calls the method from only one thread
    public static synchronized DataBase getInstance(String name) {
        if (null == instance){
            instance = new DataBase(name);
            return instance;

        }else {
            return instance;
        }
    }



    public DataBase(String name) {
        this.name = name;
    }


 //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        String text = "Database Class\n + " +
                "name: " + this.name;
        return  text;
    }
}
