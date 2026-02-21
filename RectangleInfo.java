import java.util.Scanner;

public class RectangleInfo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;

        double area;
        double perimeter;
        double diagonal;

        String trash = "";
        boolean done;

        // Width input
        done = false;
        do {
            System.out.print("Enter rectangle width: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.\n");
            }
        } while (!done);

        // Height input
        done = false;
        do {
            System.out.print("Enter rectangle height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.\n");
            }
        } while (!done);

        // Calculations
        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt((width * width) + (height * height));

        // Output
        System.out.printf("\nArea: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal: %.2f\n", diagonal);

        in.close();
    }
}Math.sqrt()

void main() {
}