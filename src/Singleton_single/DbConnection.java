package Singleton_single;

public class DbConnection {
    private static DbConnection instance=new DbConnection();

    private DbConnection(){

    }
    private static DbConnection getInstance(){

        return instance;
    }

}
