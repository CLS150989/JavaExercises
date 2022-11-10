public class Main {
    public static void main(String[] args) {



        DataBase testDatabase = new DataBase("db_movies");
        DataBase dataBase =  DataBase.getInstance("db_music");
        System.out.println(dataBase.toString());

    }
}
