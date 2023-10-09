package HashTable;

import java.util.Hashtable;

public class GetOrDefaultExemple {
    public static void main(String[] args) {
        Hashtable<Integer,String>map=new Hashtable<>();
        map.put(101,"harsh");
        map.put(102,"rajeev");
        map.put(103,"deepak");
        map.put(104,"shukla");
        System.out.println(map.getOrDefault(101,"chotu"));
        System.out.println(map.getOrDefault(106,"harsh"));
    }
}
