public class P55ReturnTypeMethod {

    // Method that calculates the sum of two integers and returns the result
    public int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Create an instance of ReturnTypeMethod
        P55ReturnTypeMethod demo = new P55ReturnTypeMethod();

        // Call the method and store the result
        int sum = demo.calculateSum(10, 5);

        // Print the result
        System.out.println("Sum: " + sum);
    }
}