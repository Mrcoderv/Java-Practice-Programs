// ConstructorInheritance.java
class ParentClass {
    // Constructor of ParentClass
    public ParentClass() {
        System.out.println("Parent class object created.");
    }
}

class ChildClass extends ParentClass {
    // Constructor of ChildClass
    public ChildClass() {
        // Implicit call to super() is made here to call the ParentClass constructor
        System.out.println("Child class object created.");
    }
}

public class P45ConstructorInheritance {
    public static void main(String[] args) {
        // Create an object of ChildClass
        ChildClass childObj = new ChildClass();
    }
}
