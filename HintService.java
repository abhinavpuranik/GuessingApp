/*
Hints class to check whether hints are available and to generate hints based on the target number and the number of hints already used.

*/

public class HintService {
    
    public static String generateHint(int target, int hintCount) {

        if(hintCount == 1) {
            return (target % 2 == 0) ? "HINT: The number is even." : "HINT: The number is odd.";
        }else if(hintCount == 2) {
            return (target > 50) ? "HINT: The number is greater than 50." : "HINT: The number is 50 or less.";
        }

        return "No more hints available.";
    }
}
