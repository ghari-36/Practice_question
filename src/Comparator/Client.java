package Comparator;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        list.add(new Student(101,"aman",60));
        list.add(new Student(102,"rishi",10));
        list.add(new Student(103,"hari",45));
        list.add(new Student(104,"harsh",50));
        Collections.sort(list,new MarksComparator());
        for(Student s:list){
            System.out.println(s.name);
        }
    }
}
