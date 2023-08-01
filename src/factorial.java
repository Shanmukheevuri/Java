import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter the num");
       int num= sc.nextInt();
       int fact =1;
        for (int i=1;i<=num;i++) {
            fact=fact*i;
        }
        System.out.println(fact);             // factorial Dynamic


   //     int num = 4;
     //   int fact= 1;
        for (int i=1;i<=4;i++) {
            fact=fact*i;
        }
        System.out.println("factorial "+4+"is"+fact);   // Factorial Static



    }





}
