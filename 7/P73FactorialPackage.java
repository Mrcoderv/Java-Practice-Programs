import com.example.FactorialCalculator;
import java.util.Scanner;

public class P73FactorialPackage {
    public static void main(String[] args) {
        // Create an instance of FactorialCalculator
        FactorialCalculator calculator = new FactorialCalculator();
        
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a number
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        
        // Calculate the factorial
                   int result = calculator.calculateFactorial(number);
            System.out.println("The factorial of " + number + " is " + result);
     
        scanner.close();
    }
}
