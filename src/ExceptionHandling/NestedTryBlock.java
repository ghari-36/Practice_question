package ExceptionHandling;

public class NestedTryBlock {
    public static void main(String[] args) {
        try{
            try{
                int b=30/0;
            }catch (ArithmeticException AE){
                System.out.println("not possible");
            }
            try {
                int[]a=new int[5];
                a[5]=6;
            }catch (ArrayIndexOutOfBoundsException AI){
                System.out.println("Array out of indexed");
            }

        }  catch (Exception e){
            System.out.println(e);
        }
    }
}
