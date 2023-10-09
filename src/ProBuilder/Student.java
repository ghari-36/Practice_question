package ProBuilder;

public class Student {
    int rollNO;
    String name;
    int age;
    String univercity;
    double psp;

    public Student(Builder builder){
        if(builder.getAge()>100){
            throw new IllegalArgumentException("age is out of bound");

        }
        this.age=builder.getAge();
        this.name=builder.getName();

    }
    public static Builder getBuilder(){
        return new Builder();

    }


    static class Builder{
      private   int rollNO;
      private  String name;
        private  int age;
        private  String univercity;
        private  double psp;
        public int getRollNO() {
            return rollNO;
        }

        public void setRollNO(int rollNO) {
            this.rollNO = rollNO;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUnivercity() {
            return univercity;
        }

        public void setUnivercity(String univercity) {
            this.univercity = univercity;
        }

        public double getPsp() {
            return psp;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        public  Student Build(){
            return new Student(this);
        }

    }
}
