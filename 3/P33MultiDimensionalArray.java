public class P33MultiDimensionalArray {
           public static void main(String[] args) {
            // Creating a 2D array
            int[][] myNumbers = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
            };

            // Accessing elements
            System.out.println("Element at row 1, column 2: " + myNumbers[0][1]); // Outputs 2

            // Changing an element
            myNumbers[1][2] = 99;
            System.out.println("Updated element at row 2, column 3: " + myNumbers[1][2]); // Outputs 99

            // Looping through the array
            for (int i = 0; i < myNumbers.length; i++) {
                for (int j = 0; j < myNumbers[i].length; j++) {
                    System.out.print(myNumbers[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

