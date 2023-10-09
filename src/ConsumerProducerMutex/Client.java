package ConsumerProducerMutex;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Queue<Object>queue=new ConcurrentLinkedQueue<>();
        Lock lock=new ReentrantLock();

        Producer p1 = new Producer(queue, 6, "p1",lock);
        Producer p2 = new Producer(queue, 6, "p2",lock);
        Producer p3 = new Producer(queue, 6, "p3",lock);

        Consumer c1 = new Consumer(queue, 6, "c1",lock);
        Consumer c2 = new Consumer(queue, 6, "c2",lock);
        Consumer c3 = new Consumer(queue, 6, "c3",lock);


        Thread t1 = new Thread(p1);

        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);



        Thread t4 = new Thread(c1);

        Thread t5 = new Thread(c2);

        Thread t6 = new Thread(c3);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();


        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();






    }
}
