import com.example.NumberChecker;
import java.util.Scanner;
public class P72NumberChecker {
    public static void main(String[] args) {
        // Use the enum instance to call the method
        NumberChecker numCheck = NumberChecker.INSTANCE;
Scanner scan = new Scanner(System.in);
System.err.printf("Enter a number:");
        // Check if a number is even or odd
        int number = scan.nextInt();
        String result = numCheck.checkEvenOdd(number);
        System.out.println("The number " + number + " is " + result);
    }
}
