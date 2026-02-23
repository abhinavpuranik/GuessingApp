/*
Guessing App UC1 - Game Initiilization
- Create a class named `GuessingApp` with a `main` method to start the application.
- In the `main` method, create an instance of the `GameConfig` class to initialize the game settings.
- Call the `showRules` method from the `GameConfig` instance to display the game    rules to the user.

@author: developer
@version: 1.0


*/

public class GuessingApp {
    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();
     
    }
}
