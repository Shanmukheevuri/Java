import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count =0;
        for (int i=2; i<=n-1; i++) {
            if(n % i == 0) {
                count++;
                }
            if (count > 0) {
                System.out.println("This is not a prime number");
            } else if (count==0){

                System.out.println("This is a prime number");

            }

            }

        }
    }



