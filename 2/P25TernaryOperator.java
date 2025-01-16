public class P25TernaryOperator
{       public static void main(String[] args) {
            int a = 10;
            int b = 20;

            System.out.println("Values: a = " + a + ", b = " + b);

            // Ternary operator
            String result = (a > b) ? "a is greater than b" : "a is less than or equal to b";
            System.out.println("Conditional result: " + result);
        }
    }

