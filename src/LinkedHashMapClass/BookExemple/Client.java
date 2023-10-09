package LinkedHashMapClass.BookExemple;

import java.util.LinkedHashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Book b1=new Book(101,"bhavbhuti");
        Book b2=new Book(102,"shiv mangle");
        LinkedHashMap<Integer,Book>map=new LinkedHashMap<>();
        map.put(1,b1);
        map.put(2,b2);

        for(Map.Entry<Integer,Book>m1:map.entrySet()){
            int i= m1.getKey();
            Book b=m1.getValue();
            System.out.println(i);
            System.out.println(b.id+" "+b.author_name);

        }

    }
}
