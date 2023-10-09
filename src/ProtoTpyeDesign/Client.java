package ProtoTpyeDesign;

public class Client {
    public static void fillRegistry( StudentRegistry registry){

        Student julyBatch = new Student();
        julyBatch.setBatchName("full Stack WEb Developement");
        julyBatch.setAvrageBatchPsp(90);
        registry.register("full Stack WEb Developement",julyBatch);


    }

    public static void main(String[] args) {
        StudentRegistry registry=new StudentRegistry();
        fillRegistry(registry);

        Student hari=registry.get("full Stack WEb Developement").clone();
        hari.setName("harimohan");
        hari.setAge(30);


       // System.out.println(hari.getAvrageBatchPsp()+" "+ hari.getAge()+" "+hari.getName()+" "+hari.getBatchName());

        System.out.println("Debug");
    }

}
