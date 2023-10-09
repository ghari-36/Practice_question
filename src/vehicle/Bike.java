package vehicle;

public interface Bike {
    public void Speed();


    default void company(){
        System.out.println("many car");
    }
}
