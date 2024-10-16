
import java.util.Scanner;
import java.util.Random;

class newGame {
    private int randomNumber;
    private int noOfGuesses;

    // Constructor to generate the random number
    public  newGame() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;  // Generate random number between 1 and 100
        noOfGuesses = 0;
    }

    // Method to take user input
    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        return sc.nextInt();
    }

    // Method to check if the user has guessed the correct number
    public boolean isCorrectNumber(int userGuess) {
        noOfGuesses++;
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You've guessed the correct number.");
            return true;
        } else if (userGuess < randomNumber) {
            System.out.println("The number is higher.");
        } else {
            System.out.println("The number is lower.");
        }
        return false;
    }

    // Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public static void main(String[] args) {
        Game game = new Game();  // Game object
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (!guessedCorrectly) {
            int userGuess = game.takeUserInput();  // Taking input from user
            guessedCorrectly = game.isCorrectNumber(userGuess);  // Checking if the guess is correct
        }

        System.out.println("You guessed the number in " + game.getNoOfGuesses() + " attempts.");
    }
}
