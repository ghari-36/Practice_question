package GarbageCollectorDemo;

public class Client {
    public static void main(String[] args) {
        Garbage1 garbage1=new Garbage1();
        garbage1.name="hari";
        garbage1.rollNo=123;
        System.out.println(garbage1.name+" "+ garbage1.rollNo);
        garbage1=null;
        System.gc();
        System.out.println(garbage1.name+garbage1.rollNo);
    }




}
