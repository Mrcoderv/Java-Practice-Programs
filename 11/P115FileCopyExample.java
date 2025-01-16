import java.io.*;

public class P115FileCopyExample {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("source.txt");
             OutputStream out = new FileOutputStream("destination.txt")) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
