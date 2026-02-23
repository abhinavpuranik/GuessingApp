/*
Guessing App UC1 - Game Initiilization
- Create a class named `GuessingApp` with a `main` method to start the application.
- In the `main` method, create an instance of the `GameConfig` class to initialize the game settings.
- Call the `showRules` method from the `GameConfig` instance to display the game    rules to the user.

@author: developer
@version: 1.0


*/
import java.util.Scanner;

public class GuessingApp {
    public static void main(String[] args) throws InvalidInputException {
        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();

        Scanner scanner = new Scanner(System.in);

        //attempts and hints used counters
        int attempts = 0;
        int hintsUsed = 0;

        while(attempts < gameConfig.getMaxAttempts()) {


            System.out.print("Enter your guess : ");
            int guess = ValidationService.validateInput(scanner.nextLine());
            attempts++;

            String result = GuessValidator.validateGuess(guess, gameConfig.getTargetNumber());
            System.out.println(result);

            if("CORRECT".equals(result)) {
                break;

            }

            if(!"CORRECT".equals(result) && hintsUsed < gameConfig.getMaxHints()) {
                hintsUsed++;
                System.out.println(HintService.generateHint(gameConfig.getTargetNumber(), hintsUsed));

            }

            System.out.println(result);

        }
     
    }
}
