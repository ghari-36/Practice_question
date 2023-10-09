package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExemple3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("brijesh");
        list.add("suman");
        list.add("harimohan");
        list.add("abhishek");

        System.out.println("iterate through LIST ITERATOR");
        ListIterator<String>listIterator= list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            String str=listIterator.previous();
            System.out.println(str);

        }

        System.out.println("iterate through FOR EACH() method");
        list.forEach(a->{
            System.out.println(a);
        });


    }
}
