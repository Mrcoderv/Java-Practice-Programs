import java.util.Scanner;
public class P38StringBuffer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many characters you want to input:");
        int count = scan.nextInt();
        scan.nextLine(); // Consume newline

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter character " + (i + 1) + ": ");
            String str = scan.nextLine();
            buffer.append(str);
        }

        scan.close();
        System.out.println("Concatenated string: " + buffer.toString());
    }
}
