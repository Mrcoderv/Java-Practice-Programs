public class P85ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        accessArrayElement(myArray, 1);  // Valid index
        accessArrayElement(myArray, 5);  // Invalid index
    }

    public static void accessArrayElement(int[] array, int index) {
        try {
            int element = array[index];
            System.out.println("The element at index " + index + " is: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds for the array.");
        }
    }
}