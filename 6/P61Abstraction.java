// Abstraction Example :Abstract class Animal       
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();
}
// Subclass (inherited from Animal)
class Dog extends Animal {
    // Providing implementation for the abstract method
    void makeSound() {
        System.out.println("Woof");
    }
}
// Main class to test the abstraction
public class P61Abstraction {
    public static void main(String[] args) {
        // Cannot instantiate an abstract class directly
        // Animal a = new Animal(); // This will cause an error
        // Instantiate the subclass
        Animal myDog = new Dog();
        myDog.makeSound(); // Call the abstract method implemented in the subclass});
    }}