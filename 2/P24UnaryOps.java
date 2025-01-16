public class P24UnaryOps {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Initial value of a: " + a);

        // Pre-increment
        int preIncrement = ++a; // Increment first, then use the value
        System.out.println("After pre-increment (++a): " + preIncrement);

        // Post-increment
        int postIncrement = a++; // Use the value first, then increment
        System.out.println("After post-increment (a++): " + postIncrement);
        System.out.println("Value of a after post-increment: " + a);

        // Pre-decrement
        int preDecrement = --a; // Decrement first, then use the value
        System.out.println("After pre-decrement (--a): " + preDecrement);

        // Post-decrement
        int postDecrement = a--; // Use the value first, then decrement
        System.out.println("After post-decrement (a--): " + postDecrement);
        System.out.println("Value of a after post-decrement: " + a);
    }
}
