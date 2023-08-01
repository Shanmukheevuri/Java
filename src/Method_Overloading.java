import java.io.IOException;

public class Method_Overloading {
    public void Tc1() {
        System.out.println("Hello");
    }

    public void Tc1(int a) {
        System.out.println(++a);
    }

    public void Tc1(int a, int b) {
        System.out.println(a + b);
    }

    public void Tc1(int a, int b, String str) {
        System.out.println(a - b);
    }


    public static void main(String[] args) throws IOException {
     Method_Overloading obj = new Method_Overloading();
     obj.Tc1(8,9);
}}