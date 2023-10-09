package Singleton_single.DoubleCheck;

public class dbConnection1 {
    public static dbConnection1 instance=null;

    private dbConnection1(){

    }
    public static dbConnection1 getInstance(){
        if(instance==null){
            synchronized (dbConnection1.class){
                if(instance==null){
                    instance=new dbConnection1();
                }
            }
        }
        return instance;
    }
}
