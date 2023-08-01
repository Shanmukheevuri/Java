//import java.text.BreakIterator;
import java.util.Scanner;
//import java.util.prefs.BackingStoreException;

public class class_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextInt();
        System.out.println("enter your choice");
        int ch = sc.nextInt();
        switch (ch) {
            case 1 -> System.out.println("Value:" + (a + b));
            case 2 -> System.out.println("Value:" + (a - b));
            case 3 -> System.out.println("Value:" + (a * b));
            case 4 -> System.out.println("Value:" + (a / b));
            default -> System.out.println("Rokey");
        }

    }
}
      //  System.out.println(10+20+"Java point");
       // System.out.println("java point" + 10+10);






