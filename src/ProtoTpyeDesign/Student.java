package ProtoTpyeDesign;

public class Student implements ProtoType<Student>{
    private String name;
    private int age ;
    String batchName;
     double avrageBatchPsp;


    public Student(){

    }

    public Student(Student student){
        this.name=name;
        this.age=age;
        this.batchName=batchName;
        this.avrageBatchPsp=avrageBatchPsp;

    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvrageBatchPsp() {
        return avrageBatchPsp;
    }

    public void setAvrageBatchPsp(double avrageBatchPsp) {
        this.avrageBatchPsp = avrageBatchPsp;
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

    @Override
    public Student clone() {
       return new Student(this);
    }
}
