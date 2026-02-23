/*
 ValidationService class to validate user input, ensuring that it is an integer within the specified range (1-100). 
 It throws an InvalidInputException for invalid inputs, which can be handled in the main game loop to provide feedback to the user.
*/

public class ValidationService {
    
    public static int validateInput(String input) throws InvalidInputException {
        try {
            int value = Integer.parseInt(input);

            if(value < 1 || value > 100) {
                throw new InvalidInputException("Input must be an integer between 1 and 100.");
            }

            return value;

        } catch (NumberFormatException e) {
            throw new InvalidInputException("Invalid input. Please enter a valid integer.");
        }
    }
}
