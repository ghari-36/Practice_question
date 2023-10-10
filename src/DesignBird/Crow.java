package DesignBird;

public class Crow extends Bird implements Soundable{
    @Override
    public void eat() {
        System.out.println("eating  fast");
    }

    @Override
    public void sound() {
        System.out.println("making fast sound");

    }
}
