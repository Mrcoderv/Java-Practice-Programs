import java.util.InputMismatchException;
import java.util.Scanner;
public class P84InputMismatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Please enter an integer: ");
            try {
                number = scanner.nextInt();
                break; // Exit the loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Error: That's not a valid integer. Please try again.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("You entered: " + number);
        scanner.close();
    }
}
