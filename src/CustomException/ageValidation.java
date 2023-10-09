package CustomException;

public class ageValidation {

    public  void ageConfirmation(int age) throws InvalidAgeExcetion {
        if(age>18){
            throw new InvalidAgeExcetion("Age is invalid.please try valid age");
        }
        else{
            System.out.println("welcome to vote");
        }
    }
}
