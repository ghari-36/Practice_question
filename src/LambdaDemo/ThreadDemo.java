package LambdaDemo;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Runnable r=()->{
            System.out.println(Thread.currentThread().getName());

        };
        Thread t1=new Thread(r);
        t1.start();

        Thread t2=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t2.start();

    }
}
