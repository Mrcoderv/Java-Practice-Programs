// ParameterizedConstructor.java
public class P42ParameterizedConstructor {
    // Attributes
    private int length;
    private int breadth;

    // Parameterized constructor
    public P42ParameterizedConstructor(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public int calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Create an object of ParameterizedConstructor with length 5 and breadth 10
        P42ParameterizedConstructor rectangle = new P42ParameterizedConstructor(5, 10);

        // Calculate the area of the rectangle
        int area = rectangle.calculateArea();
        System.out.println("Rectangle area: " + area);
    }
}
