import java.util.Scanner;
public class P03PrintingDetail {
       public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String var2 = var1.next();
        System.out.print("Enter last name: ");
        String var3 = var1.next();
        System.out.print("Enter age: ");
        int var4 = var1.nextInt();
        var1.nextLine();
        System.out.print("Enter address: ");
        String var5 = var1.nextLine();
        System.out.println("First name: " + var2 + ", Last name: " + var3);
        System.out.println("Address: " + var5);
        StringBuilder var6 = new StringBuilder();
        var6.append(var2).append(" ").append(var3);
        System.out.println("Full name using StringBuilder: " + var6.toString());
        System.out.println("Age: " + var4);
        var1.close();
    }
}
