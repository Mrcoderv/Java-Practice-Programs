import java.util.Scanner;

public class P04ShopingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the price of one item
        System.out.print("Enter the price of one item: ");
        double price = input.nextDouble();

        // Ask for the number of items
        System.out.print("Enter the number of items: ");
        int quantity = input.nextInt();

        // Calculate the total cost before tax
        double totalCost = price * quantity;

        // Calculate the tax (13%)
        double tax = totalCost * 0.13;

        // Calculate the final amount
        double finalAmount = totalCost + tax;

        // Display the final amount
        System.out.printf("The final amount with tax is: %.2f\n", finalAmount);
        // Close the scanner
        input.close();
    }
}
