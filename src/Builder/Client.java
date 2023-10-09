package Builder;

import ArrayList.objectpass.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Helper helper=new Helper(101,"hari",30,"8103765406",
                "scaler","krishna pura",90.52);

        Student st=new Student(helper);

        System.out.println(st.getAge()+" "+st.getRollNo()+" "+ st.getPsp()+" "+st.getName());



    }
}
