package Thread;

public class Client {
    public static void main(String[] args) {
        for(int i=0;i<=10000;i++){
            PrintNumer p1=new PrintNumer(i);
            Thread t1=new Thread(p1);
            t1.start();

        }
    }
}
