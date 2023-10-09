package Synchronized;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count=new Count();
        Count count1=new Count();
        Adder adder=new Adder(count);
        Subtractor subtractor=new Subtractor(count);
        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("final result 1 :"+ count.value);

    }
}
