package Executors.printnumber;

public class NoToPrint implements Runnable{
    private int printno;

    public NoToPrint(int printno) {
        this.printno = printno;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+printno);

    }
}
