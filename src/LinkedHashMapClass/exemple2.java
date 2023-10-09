package LinkedHashMapClass;

import java.util.LinkedHashMap;

public class exemple2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String > map=new LinkedHashMap<>();
        map.put(101,"akanksha");
        map.put(102,"rashmi");
        map.put(103,"mushkan");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
