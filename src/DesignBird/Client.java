package DesignBird;

public class Client {
    public static void main(String[] args) {
        Bird b=new Sparrow();
        b.eat();

        Sparrow sparrow=new Sparrow();
        sparrow.eat();
        sparrow.sound();
        sparrow.fly();

        Soundable s=new Crow();
        s.sound();


        Flyable f=new Peigon();
        f.fly();

    }
}
