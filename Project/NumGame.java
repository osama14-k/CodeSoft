package Project;
import java.util.Scanner;
import java.util.Random;

public class NumGame {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int targetNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nGuess the number between 1 and 100!");

            while (attempts < 5) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    guessed = true;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessed) {
                System.out.println("You ran out of attempts! The number was " + targetNumber);
            }

            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
