public class P53StaticMethodDemo {
    // Static method that prints a message
    public static void executeStaticMethod() {
        System.out.println("Static method executed.");
    }

    public static void main(String[] args) {
        // Call the static method without creating an instance of the class
        P53StaticMethodDemo.executeStaticMethod();
    }
}