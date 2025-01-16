public class P37StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder with initial content "Java"
        StringBuilder sb = new StringBuilder("Java");

        // Appending " Programming" to the StringBuilder
        sb.append(" Programming");
        System.out.println(sb); // Output: Java Programming

        // Inserting " is fun" at index 4
        sb.insert(4, " is fun");
        System.out.println(sb); // Output: Java is fun Programming

        // Deleting " Programming" (characters from index 12 to 24)
        sb.delete(12, 24);
        System.out.println(sb); // Output: Java is fun

        // Reversing the content of the StringBuilder
        sb.reverse();
        System.out.println(sb); // Output: nuf si avaJ
    }
}
