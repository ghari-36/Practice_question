package StreamDemo;

public class Car {
    int speed;
    int price;
    String brand;

    public Car(int speed, int price, String brand) {
        this.speed = speed;
        this.price = price;
        this.brand = brand;
    }

    public String toString(){
        return "[speed : " + this.speed +"price : "+ this.price+ "brand : "+this.brand+"]";

    }



}
