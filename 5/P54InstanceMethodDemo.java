public class P54InstanceMethodDemo {
    // Instance method that prints a message
    public void executeInstanceMethod() {
        System.out.println("Instance method executed.");
    }

    public static void main(String[] args) {
        // Create an instance of InstanceMethodDemo
        P54InstanceMethodDemo demo = new P54InstanceMethodDemo();

        // Call the instance method on the created object
        demo.executeInstanceMethod();
    }
}