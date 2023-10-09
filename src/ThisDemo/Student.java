package ThisDemo;

public class Student {

    Student(){
        this(30);
    }
    Student(int age){
        this("harimohan");
        System.out.println("my age is : "+ age);

    }
    Student(String name){
        System.out.println("my name is : "+name);
    }
}
