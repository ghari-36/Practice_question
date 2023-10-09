package Executors.printnumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for(int i=0;i<100;i++){
            NoToPrint no=new NoToPrint(i);
            executorService.execute(no);
        }
        executorService.shutdown();
    }
}
