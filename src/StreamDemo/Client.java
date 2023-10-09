package StreamDemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        //Filter out even out

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
        Stream<Integer>stream=list.stream();

        System.out.println(stream.filter(x->x%2==0).toList());

        List<Car>list1=Arrays.asList(
                new Car(70,120,"BMW"),
                new Car(80,140,"AUDI"),
                new Car(90,160,"Alto")
        );
        List<Integer>prices= list1.stream().map(c-> c.price).toList();
        System.out.println(prices);
    }
}
