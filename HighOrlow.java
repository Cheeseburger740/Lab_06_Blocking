import java.util.Random;
import java.util.Scanner;
public class HighOrlow
        {import java.util.Scanner;
import java.util.Random;
    public class HighorLow {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Random generator = new Random();
            int randomNumber = generator.nextInt(10) + 1;
            int guess = 0;
            String trash = "";
            boolean done = false;
            // Bulletproof guess input
            do {
                System.out.print("Guess a number between 1 and 10: ");
                if (in.hasNextInt()) {
                    guess = in.nextInt();
                    in.nextLine();
                    if (guess >= 1 && guess <= 10) {
                        done = true;
                    } else {
                        System.out.println("Guess must be between 1 and 10.\n");
                    }
                } else {
                    trash = in.nextLine();
                    System.out.println("Invalid input: " + trash);
                    System.out.println("Please enter an integer between 1 and 10.\n");
                }
            } while (!done);
            // Show random number
            System.out.println("\nRandom number was: " + randomNumber);
            // Compare guess
            if (guess > randomNumber) {
                System.out.println("Your guess was too high.");
            }
            else if (guess < randomNumber) {
                System.out.println("Your guess was too low.");
            }
            else {
                System.out.println("You were on the money!");
            }
            in.close();
        }
}
