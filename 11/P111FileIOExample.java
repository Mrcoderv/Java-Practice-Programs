import java.io.*;

public class P111FileIOExample{
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}