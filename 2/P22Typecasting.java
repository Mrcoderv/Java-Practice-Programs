public class P22Typecasting {
          public static void main(String[] args) {
            // Implicit Casting (Widening)
            int intValue = 10;
            double doubleValue = intValue; // int to double
            System.out.println("Implicit Casting: " + doubleValue);

            // Explicit Casting (Narrowing)
            double originalDouble = 9.8;
            int narrowedInt = (int) originalDouble; // double to int
            System.out.println("Explicit Casting: " + narrowedInt);
        }
    }


