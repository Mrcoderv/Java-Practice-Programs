public class P83NumberFormatExample {
    public static void main(String[] args) {
        convertToInteger("123");  // Valid conversion
        convertToInteger("abc");  // Invalid conversion
    }

    public static void convertToInteger(String value) {
        try {
            int result = Integer.parseInt(value);
            System.out.println("The integer value is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + value + "' is not a valid integer.");
        }
    }
}