package CustomException;

public class client {
    public static void main(String[] args) {
        ageValidation ageValidation=new ageValidation();
        try {
            ageValidation.ageConfirmation(125);
        }catch (InvalidAgeExcetion ex){
            System.out.println(ex);
        }
    }
}
