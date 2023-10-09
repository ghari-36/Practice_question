package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        list.add(new Student(15,"aman",101));
        list.add(new Student(17,"rishi",102));
        list.add(new Student(14,"hari",103));
        list.add(new Student(18,"harsh",104));

        Collections.sort(list);
        for(Student s:list){
            System.out.println(s.name);
        }
    }
}
