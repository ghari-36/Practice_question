package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newCachedThreadPool();
        for (int i=0;i<10;i++){
            WorkerThread w1=new WorkerThread(" "+i);
            executor.execute(w1);
        }
        executor.shutdown();
    }
}
