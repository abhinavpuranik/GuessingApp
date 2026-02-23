/* 
  GuessValidator class to validate the user's guess against the target number and provide feedback on whether the guess is correct, too low, or too high.
*/
public class GuessValidator {
        public static String validateGuess(int guess, int target) {

            if(guess == target) {
                return "CORRECT";
            }else if (guess < target) {
                return "LOW";
            }else {
                return "HIGH";
            }
}
}
