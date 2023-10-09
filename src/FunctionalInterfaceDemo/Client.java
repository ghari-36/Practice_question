package FunctionalInterfaceDemo;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Client {
    public static void main(String[] args) {
        Consumer<Integer>consumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("value : "+integer);
            }
        };
        consumer.accept(12);

        BiPredicate<String,Integer>biPredicate=new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer integer) {
                return  (s.length()==integer);

            }
        };
        System.out.println(biPredicate.test("harimohan",9));

        BinaryOperator<Integer>binaryOperator=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer;
            }
        };

        System.out.println(binaryOperator.apply(6,7));
    }
}
