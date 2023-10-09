package ConsumerProducerMutex;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private int maxSize;
    private String name;
    Lock lock;
    public Consumer(Queue<Object>queue,int maxSize,String name,Lock lock){
        this.queue=queue;
        this.maxSize=maxSize;
        this.name=name;
        this.lock=lock;

    }
    @Override
    public void run() {
        while (true){
           lock.lock();
                if(queue.size()>0){
                    queue.remove();
                    System.out.println(name+" consumer name "+"New Queue size :"+queue.size());
                }
                lock.unlock();

        }

    }
}
