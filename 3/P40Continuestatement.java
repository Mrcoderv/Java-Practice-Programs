public class P40Continuestatement {
          public static void main(String[] args) {
            for (int i = 1; i <= 20; i++) {
                if (i % 3 == 0) {
                    continue; // skip multiples of 3
                }
                System.out.print(i + " ");
            }
        }}

