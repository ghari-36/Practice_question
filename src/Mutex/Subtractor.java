package Mutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    Lock lock;
    public Subtractor(Count count,Lock lock){
        this.count=count;
        this.lock=lock;
    }
    @Override
    public void run() {
        for(int i=1;i<=100000;i++){
            lock.lock();
            count.value=count.value-i;
            lock.unlock();
        }
    }
}
