import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Number guessing game using continuous if

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(1, 101);
        int guess;
        boolean isCorrect = false;

        System.out.println("Number guessing game");
        System.out.println("Guess a number between 1-100. Guess what? You have 5 tries.");

        System.out.print("Attempt 1: ");
        guess = scanner.nextInt();
        if (guess == randomNumber) {
            System.out.println("CORRECT! YOU DID ITTT!");
            isCorrect = true;
        } else if (guess > randomNumber) {
            System.out.println("HIGHER");
        } else {
            System.out.println("LOWER");
        }

        if (!isCorrect) {
            System.out.print("Attempt 2: ");
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("CORRECT!");
                isCorrect = true;
            } else if (guess > randomNumber) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
        }

        if (!isCorrect) {
            System.out.print("Attempt 3: ");
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("CORRECT!");
                isCorrect = true;
            } else if (guess > randomNumber) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
        }

        if (!isCorrect) {
            System.out.print("Attempt 4: ");
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("CORRECT!");
                isCorrect = true;
            } else if (guess > randomNumber) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
        }

        if (!isCorrect) {
            System.out.print("Attempt 5 (Final Try): ");
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("CORRECT!");
                isCorrect = true;
            } else if (guess > randomNumber) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
        }

        if (!isCorrect) {
            System.out.println("You lose! The number was " + randomNumber);
        }

        scanner.close();
    }
}
