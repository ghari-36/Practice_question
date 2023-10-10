package DesignBird;

public class Peigon extends Bird implements Flyable{
    @Override
    public void eat() {
        System.out.println("eating slow");
    }

    @Override
    public void fly() {
        System.out.println("flying slow");

    }
}
