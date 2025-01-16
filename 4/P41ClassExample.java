public class P41ClassExample {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public P41ClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display object information
    public void display() {
        System.out.println("Object created with name: " + name);
    }

    public static void main(String[] args) {
        // Create an object of P41ClassExample
        P41ClassExample obj = new P41ClassExample("John", 25);
        
        // Display the object information
        obj.display();
    }
}
