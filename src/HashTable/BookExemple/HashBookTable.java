package HashTable.BookExemple;

import java.util.Hashtable;
import java.util.Map;

public class HashBookTable {
    public static void main(String[] args) {
        Hashtable<Integer,Book>map=new Hashtable<>();
        Book b1=new Book(1,"hari","gyanganga","k.k.",40);
        Book b2=new Book(2,"abhishek","mohan","r.k.",45);

        map.put(101,b1);
        map.put(102,b2);
        for(Map.Entry<Integer,Book> m1:map.entrySet()){
            int i=  m1.getKey();
            Book b=m1.getValue();
            System.out.println(i);

            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
