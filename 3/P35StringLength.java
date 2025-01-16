import java.util.Scanner;
public class P35StringLength {//java length
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Length of the string: " + input.length());
        scanner.close();
    }
}

