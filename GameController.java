/*
Game contrroller class to manage game flow, including restarting the game based on user input after a win or loss.
*/
import java.util.Scanner;

public class GameController {
    
    public static boolean restartGame(Scanner scanner) {
        System.out.print("Do you want to play again? (yes/no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");

    }
}
