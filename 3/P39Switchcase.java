import java.util.Scanner;
public class P39Switchcase {
        public static void main(String[] args) {
            System.out.println("Enter your grade A,B,C,D Or F:");
            Scanner uu =new Scanner(System.in);
            String  c= uu.next();
            switch (c) {
                case "A":
                    System.err.println("papa ji hum ko sikado ");
                    break;

                case "B":
                    System.err.println("Good job");
                    break;

                case "C":
                    System.err.println("you pass");
                    break;
                case "D":
                case "E":
                    System.err.println("Needs imporovement");
                    break;
                default:
                    System.err.println("error input ");
                    break;
            }
        }

    }
