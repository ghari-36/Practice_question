package DesignBird;

public class Sparrow extends Bird implements Flyable,Soundable{
    @Override
    public void eat() {
        System.out.println("eating little fast");
    }

    @Override
    public void fly() {
        System.out.println("flyinf little fast");

    }

    @Override
    public void sound() {
        System.out.println("making little sound");

    }
}
