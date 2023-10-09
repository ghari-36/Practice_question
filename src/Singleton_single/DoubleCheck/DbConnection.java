package Singleton_single.DoubleCheck;

public class DbConnection {
    private static DbConnection instance=null;
    private DbConnection(){

    }
    private static DbConnection getInstance(){
        if(instance==null){
            synchronized (DbConnection.class){
                if(instance==null){
                    instance=new DbConnection();

                }
            }


        }
        return instance;
    }
}
