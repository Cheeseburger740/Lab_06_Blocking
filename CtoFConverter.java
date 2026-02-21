import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;
        // Bulletproof input using do-while
        do {
            System.out.print("Enter temperature in Celsius: ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.\n");
            }

        } while (!done);

        // Convert after valid input
        fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        in.close();
    }
