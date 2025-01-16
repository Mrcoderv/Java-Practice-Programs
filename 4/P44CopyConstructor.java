// CopyConstructor.java
public class P44CopyConstructor {
    // Attributes
    private String name;
    private int age;

    // Parameterized constructor
    public P44CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public P44CopyConstructor(P44CopyConstructor original) {
        this.name = original.name;
        this.age = original.age;
    }

    // Method to display object values
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        P44CopyConstructor original = new P44CopyConstructor("John", 25);
        
        // Create a copy of the original object using the copy constructor
        P44CopyConstructor copy = new P44CopyConstructor(original);

        // Display the values of the original object
        System.out.println("Original object values:");
        original.display();

        // Display the values of the copied object
        System.out.println("Copied object values:");
        copy.display();
    }
}
