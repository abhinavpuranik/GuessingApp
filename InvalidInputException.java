
/*
    InvalidInputException class to handle invalid user input scenarios, such as non-integer inputs or out-of-range guesses.
*/
public class InvalidInputException extends Exception {
    
    public InvalidInputException(String message) {
        super(message);

    }
}
