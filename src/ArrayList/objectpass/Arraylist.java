package ArrayList.objectpass;

public class Arraylist {
    private int rollno;
    private String name;
    private int age;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Arraylist(int rollno, String name, int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
