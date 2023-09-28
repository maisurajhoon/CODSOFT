import java.util.Scanner;
import java.util.Random;

public class Number_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int secretNumber;
        int maxAttempts = 10;
        int attempts;

        int roundsPlayed = 0;
        int roundsWon = 0;

        boolean playAgain = true;

        while (playAgain) {
            roundsPlayed++;
            secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            attempts = 0;

            System.out.println("Round " + roundsPlayed);

            while (attempts < maxAttempts) {
                System.out.print("Guess the number between 1 and 100: ");
                int guess = input.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number (" + secretNumber + ") in "
                            + attempts + " attempts.");
                    roundsWon++;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The secret number was "
                            + secretNumber + ".");
                    break;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = input.next().toLowerCase();
            if (!response.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing! You won " + roundsWon + "/" + roundsPlayed + " rounds.");
        input.close();
    }
}
