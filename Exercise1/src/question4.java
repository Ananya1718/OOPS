import java.util.Random;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = rand.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too High");
            } else if (guess < numberToGuess) {
                System.out.println("Too Low");
            } else {
                System.out.println("Correct Guess! 🎉");
                System.out.println("You guessed it in " + attempts + " attempt(s).");
            }

        } while (guess != numberToGuess);

        scanner.close();
    }
}
