import com.example.ClassA;
import com.example.ClassB;

public class P74PackageClassInteraction {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        classA.displayMessage();
        classB.showMessage();

        System.out.println("Interaction successful.");
    }
}
