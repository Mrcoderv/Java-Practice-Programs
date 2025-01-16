public class P43PrivateConstructor {
    // Private constructor
    private P43PrivateConstructor() {
        System.out.println("Private constructor called.");
    }

    // Static method to create an instance of PrivateConstructor
    public static P43PrivateConstructor createInstance() {
        return new P43PrivateConstructor();
    }

    public static void main(String[] args) {
        // Trying to create an instance directly will result in a compilation error
        // PrivateConstructor obj = new PrivateConstructor(); // This line will not compile

        // Create an instance using the static method
        
        P43PrivateConstructor obj = P43PrivateConstructor.createInstance();
        System.out.println("Object created internally using the static method.");
    }
}

    
