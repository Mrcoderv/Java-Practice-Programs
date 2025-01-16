import calculator.Addition;
import calculator.Division;
import calculator.Multiplication;
import calculator.Subtraction;
import java.util.Scanner;

public class P75CalculatorPackageDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        System.out.println("Welcome to the Calculator!");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        try {
            switch (choice) {
                case 1:
                    System.out.println("Result: " + addition.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtraction.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiplication.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + division.divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Custom calculator package executed.");
        scanner.close();
    }
}
