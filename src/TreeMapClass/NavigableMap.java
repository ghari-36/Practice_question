package TreeMapClass;

import java.util.TreeMap;

public class NavigableMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(120,"kamal");
        map.put(96,"jeet");
        map.put(966,"hosh");

        System.out.println(map.descendingMap());
        System.out.println(map.headMap(966));
        System.out.println(map.tailMap(96));
        System.out.println(map.subMap(96,true,966,true));
    }
}
