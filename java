import java.util.Random;
import java.util.Scanner;

public class Numbergame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            int userGuess;

            System.out.println("\nI've generated a number between " + minRange + " and " + maxRange + ". Try to guess it!");

            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

            } while (userGuess != generatedNumber && attempts < maxAttempts);

            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! Your total score is: " + score);
        scanner.close();
    }
}
