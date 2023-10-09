package Executors;

public class WorkerThread implements Runnable{

    private String member;
    public WorkerThread(String member){
        this.member=member;

    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+"start message"+member);
        System.out.println(Thread.currentThread().getName()+" "+"end message");

    }
}
