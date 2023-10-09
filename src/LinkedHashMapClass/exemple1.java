package LinkedHashMapClass;

import java.util.LinkedHashMap;
import java.util.Map;

public class exemple1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String >map=new LinkedHashMap<>();
        map.put(101,"akanksha");
        map.put(102,"rashmi");
        map.put(103,"mushkan");
        for(Map.Entry m1: map.entrySet()){
            System.out.println(m1.getKey()+" "+m1.getValue());
        }
    }
}
