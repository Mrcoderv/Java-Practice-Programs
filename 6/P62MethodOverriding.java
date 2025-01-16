// Base class (Parent class)
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}

// Derived class (Child class)
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Another derived class (Child class)
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class P62MethodOverriding  {
    public static void main(String[] args) {
        // Create objects of the derived classes
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the overridden methods
        myDog.makeSound();
        myCat.makeSound();
    }
}
