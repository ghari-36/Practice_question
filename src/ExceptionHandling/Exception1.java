package ExceptionHandling;

public class Exception1 {
    public static void main(String[] args) {
        try{
            int z=50/0;
        }catch (ArithmeticException Ae){
            System.out.println("divide by zero not possible");
        }
        System.out.println("my name is don");
    }
}
