package Synchronized.Static;

public class StaticCounter {
    private static int count=0;
    public static synchronized void increment(){
        count++;
    }
    public static synchronized int getCount(){
        return count;
    }

    public static void main(String[] args) {
        StaticCounter staticCounter=new StaticCounter();
        for(int i=1;i<=100000;i++){

        }
    }
}
