import java.util.Random;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        // Number guessing game ass

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 101);

        System.out.println("Number guessing game");
        System.out.println("Guess a number between 1-100: ");

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("LOWER");
            } else if (guess > randomNumber) {
                System.out.println("HIGHER");
            } else {
                System.out.println("CORRECT! You got it in " + attempts + " attempts.");
            }
        } while (guess != randomNumber && attempts < 5);

        if (guess != randomNumber) {
            System.out.println("You lose! The number was " + randomNumber);

        }

        scanner.close();

    }
}