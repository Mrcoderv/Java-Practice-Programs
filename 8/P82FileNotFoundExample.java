import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P82FileNotFoundExample {
    public static void main(String[] args) {
        readFile("existing_file.txt");  // Change to a valid file name
        readFile("non_existing_file.txt");  // File does not exist
    }

    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        }
    }
}