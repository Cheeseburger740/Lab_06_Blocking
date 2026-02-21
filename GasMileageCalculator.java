import java.util.Scanner;

public class GasMileageCalculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;

        double cost100Miles;
        double maxDistance;

        String trash = "";
        boolean done;

        // Gallons input
        done = false;
        do {
            System.out.print("Enter number of gallons in tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.\n");
            }
        } while (!done);

        // MPG input
        done = false;
        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.\n");
            }
        } while (!done);

        // Price per gallon input
        done = false;
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.\n");
            }
        } while (!done);

        // Calculations
        cost100Miles = (100.0 / mpg) * pricePerGallon;
        maxDistance = gallons * mpg;

        // Output
        System.out.printf("\nCost to drive 100 miles: $%.2f\n", cost100Miles);
        System.out.printf("Maximum distance with full tank: %.2f miles\n", maxDistance);

        in.close();
    }
}