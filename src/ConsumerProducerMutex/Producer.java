package ConsumerProducerMutex;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{
   private Queue<Object>queue;
    private int maxSize;
    private String name;
    Lock lock;

    public Producer(Queue<Object>queue,int maxSize,String name,Lock lock){
        this.queue=queue;
        this.maxSize=maxSize;
        this.name=name;
        this.lock=lock;
    }
    @Override
    public void run() {
        while(true){
            synchronized (queue){
                if(queue.size()<maxSize){
                    queue.add(new Object());
                    System.out.println(name +"Adding a shirt ."+"New size of queue : "+queue.size());
                }
            }
        }

    }
}
