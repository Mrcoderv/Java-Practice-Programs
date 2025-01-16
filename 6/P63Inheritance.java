// Base class (or Parent class)
class Animal {
    // Method in the parent class
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (or Child class)
class Dog extends Animal {
    // Additional method in the child class
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class P63Inheritance {
    public static void main(String[] args) {
        // Create an object of the derived class
        Dog myDog = new Dog();

        // Call the method from the parent class
        myDog.eat();

        // Call the method from the child class
        myDog.bark();
    }
}
