package SuperDemo;

public class Cat extends Animal{
    public void walk(){
        System.out.println("slow Walking");
    }

    Cat(){
        String colour="Black";
        System.out.println("cat colour is : "+super.colour);
        System.out.println("cat colour is : "+colour);

    }
    Cat(String col){
        System.out.println("pussy cat colour is : "+col);

    }

}
