package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class AddandIterate {
    public static void main(String[] args) {
        Hashtable<Integer,String>table=new Hashtable<>();
        table.put(101,"harsh");
        table.put(102,"rajeev");
        table.put(103,"deepak");
        table.put(104,"shukla");

        for(Map.Entry m: table.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(table.toString());
    }
}
