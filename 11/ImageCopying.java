// Program: Copying an Image File
import java.io.*;

public class ImageCopying {
    public static void main(String[] args) {
        // Replace with the path of your source image file
        File sourceFile = new File("image.jpeg");
        // Replace with the path for the destination image file
        File destFile = new File("destination.png");

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read and write data in chunks
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully!");
        } catch (IOException e) {
            // Print the stack trace for any IO exceptions
            e.printStackTrace();
        }
    }
}
