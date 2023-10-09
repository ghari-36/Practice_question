package Builder;

public class Helper {
   private int rollNo;
    private  String name;
    private int age;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getUnivercity() {
        return univercity;
    }

    public void setUnivercity(String univercity) {
        this.univercity = univercity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    private String phoneNo;
    private String univercity;
    private String address;
    private double psp;
    public Helper(int rollNo,String name,int age,String phoneNo,String univercity,String address,double psp){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.phoneNo=phoneNo;
        this.univercity=univercity;
        this.address=address;
        this.psp=psp;

    }
}
