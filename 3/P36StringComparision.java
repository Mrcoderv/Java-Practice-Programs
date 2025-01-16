import java.io.PrintStream;
public class P36StringComparision {

    public static void main(String[] var0) {
        String var1 = "Hello";
        String var2 = new String("Hello");
        System.out.println("Using == comparison: " + (var1 == var2));
        PrintStream var10000 = System.out;
        boolean var10001 = var1.equals(var2);
        var10000.println("Using .equals() comparison: " + var10001);
    }
}