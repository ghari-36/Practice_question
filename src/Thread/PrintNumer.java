package Thread;

public class PrintNumer implements Runnable{
    private int noToPrint;
    public PrintNumer(int noToPrint){
        this.noToPrint=noToPrint;
    }
    public void run(){

            System.out.println("printing :"+noToPrint+"."+"print by thread"+Thread.currentThread().getName());



    }



}
