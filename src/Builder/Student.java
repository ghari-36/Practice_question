package Builder;

import java.security.SecureRandom;

public class Student {
    private int rollNo;
    private String name;

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

    private int age;
    private String phoneNo;
    private String univercity;
    private String address;
    private double psp;

    public Student(Helper helper){
        if(helper.getAge()>100){
            throw new IllegalArgumentException("age is out of bound");
        }
        if(helper.getPsp()>100){
            throw new IllegalArgumentException("psp is out of range");

        }
        this.age=helper.getAge();
       this.rollNo=helper.getRollNo();
        this.name=helper.getName();
        this.phoneNo=helper.getPhoneNo();
        this.univercity=helper.getUnivercity();
        this.address=helper.getAddress();
        this.psp=helper.getPsp();
    }

}
