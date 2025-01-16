public class P52MethodOverloading {

    // Method to calculate the area of a square
    public int calculateArea(int side) {
        return side * side;
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Create an instance of P52MethodOverloading
        P52MethodOverloading obj = new P52MethodOverloading();

        // Calculate the area of a square with side 5
        int squareArea = obj.calculateArea(5);
        System.out.println("Area of square: " + squareArea);

        // Calculate the area of a circle with radius 5
        double circleArea = obj.calculateArea(5.0);
        System.out.println("Area of circle: " + circleArea);
    }
}
