package ComparableInterfaceExemple;

import java.util.PriorityQueue;

public class Client {
    public static void main(String[] args) {
        PriorityQueue<Car>pq=new PriorityQueue<>(new CaeComparator() );
        pq.add(new Car(50,200));
       pq.add(new Car(60,300));
       pq.add(new Car(70,400));

       while (!pq.isEmpty()){
           Car c=pq.poll();
           System.out.println(c.power+" "+c.speed);

       }
    }
}
