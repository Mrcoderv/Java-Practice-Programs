public class P21DataTypeDemo {
    public static void main(String[] args) {
        // Demonstrating all primitive data types in Java

        // Integer types
        byte byteValue = 127;           // Range: -128 to 127
        short shortValue = 32000;       // Range: -32,768 to 32,767
        int intValue = 100000;          // Range: -2^31 to 2^31-1
        long longValue = 10000000000L;  // Range: -2^63 to 2^63-1

        // Floating-point types
        float floatValue = 3.14f;       // Single precision
        double doubleValue = 3.14159;   // Double precision

        // Character type
        char charValue = 'A';           // Single 16-bit Unicode character

        // Boolean type
        boolean booleanValue = true;    // true or false

        // Displaying values of all primitive data types
        System.out.println("Primitive Data Types in Java:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
    }
}
