package Comparable;

public class Student implements Comparable<Student>{
    int age;
    String name;
    int rollNo;

    public Student(int age, String name, int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }


    @Override
    public int compareTo(Student o) {
      return this.age-o.age;
    }
}
