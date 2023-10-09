package ProBuilder;

public class Client {
    public static void main(String[] args) {
        Student st=Student.getBuilder()
                          .setAge(300).setName("hari").Build();

        System.out.println(st.age);




    }
}
