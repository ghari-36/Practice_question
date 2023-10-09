package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("brijesh");
        list.add("suman");
        list.add("harimohan");
        list.add("abhishek");

      // * Iterator itr=list.iterator();
       // while(itr.hasNext()){
        //    System.out.println(itr.next());
      //  }
       // System.out.println("2nd family member is : "+list.get(1));
       // list.set(2,"rupal");

        //for each loop
        for(String family:list){
            System.out.println(family);


       // System.out.println(list.toString());

        }
    }
}
