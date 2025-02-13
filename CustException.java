class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustException {
    public static void voterAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age should be 18 or above for voting.");
        }else{
            System.out.println("Voter Age is valid");
        }
    }
    public static void main(String[] args) {
        try{
            voterAge(16);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
