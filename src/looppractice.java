import java.util.Scanner;

public class looppractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("enter value n");
        n = sc.nextInt();
        for (i=1;i<=n;i++) {
            System.out.println(i);
        }
    }
}
