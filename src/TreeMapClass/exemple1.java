package TreeMapClass;

import java.util.Map;
import java.util.TreeMap;

public class exemple1 {
    public static void main(String[] args) {
        TreeMap<Integer,String>map=new TreeMap<>();
        map.put(120,"kamal");
        map.put(96,"jeet");
        map.put(966,"hosh");
        for(Map.Entry m1:map.entrySet()){
            System.out.println(m1.getKey()+" "+m1.getValue());
        }
    }
}
