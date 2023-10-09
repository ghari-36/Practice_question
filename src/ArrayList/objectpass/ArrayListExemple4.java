package ArrayList.objectpass;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExemple4 {
    public static void main(String[] args) {

        List<Arraylist> list=new ArrayList<Arraylist>();
        list.add(new Arraylist(101,"hari",29));
        list.add(new Arraylist(102,"mohan",30));
        list.add(new Arraylist(103,"Abhishek",23));

        Iterator<Arraylist> itr= list.iterator();
        while(itr.hasNext()){
            Arraylist ans=itr.next();
            System.out.println(ans.getRollno()+" "+ans.getName()+" "+ ans.getAge());

        }

       // for(Arraylist A:list){
          //  System.out.println(A.getRollno()+" "+A.getName()+" "+A.getName());
       // }


    }
}
