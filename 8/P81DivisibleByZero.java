public class P81DivisibleByZero {
    public static void main(String[] args) {
        divideNumbers(10, 2);  // Valid division
        divideNumbers(10, 0);  // Division by zero
    }

    public static void divideNumbers(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
