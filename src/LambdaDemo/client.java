package LambdaDemo;

import java.util.PriorityQueue;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class client {
    public static void main(String[] args) {
        Consumer<Integer>consumer=(x)->{
            System.out.println(x);
        };

        consumer.accept(55);

        Predicate<Integer>predicate=(x)->{
            return x>0;
        };
        System.out.println(predicate.test(99));

        Predicate<Integer>predicate1=(x)-> x>0;
        System.out.println(predicate1.test(-99));


        BiFunction<Integer,String,Boolean>biFunction=(x,y)->x==y.length();

        System.out.println(biFunction.apply(9,"harimohan"));


        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);


    }
}
