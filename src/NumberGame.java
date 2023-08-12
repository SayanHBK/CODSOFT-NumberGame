
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5; // You can adjust the number of attempts as per your preference
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int userGuess=0;
        int attempts = 0;

        System.out.println("Guess the number between " + minRange + " and " + maxRange + ".");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct!");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            if (attempts < maxAttempts) {
                System.out.println("Try again. You have " + (maxAttempts - attempts) + " attempt(s) left.");
            }
        }

        if (attempts == maxAttempts && userGuess != randomNumber) {
            System.out.println("Sorry, you've run out of attempts. The number was: " + randomNumber);
        }

        scanner.close();
    }
}