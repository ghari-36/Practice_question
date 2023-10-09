package ProtoTpyeDesign;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String,Student>map=new HashMap<>();

     Student get(String key){
        return map.get(key);
    }
     void register(String key,Student student){
        map.put(key,student);
    }
}
