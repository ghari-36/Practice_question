package ExceptionHandling;

public class Exception2 {
    public static void main(String[] args) {
        try{
            int[]a=new int[5];
            a[5]=30/0;
        }catch (ArrayIndexOutOfBoundsException Aioob){
            System.out.println("index not found");
        }catch (ArithmeticException Ae){
            System.out.println("devide by zero not possible");
        }catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println("finally executed");
    }
}
