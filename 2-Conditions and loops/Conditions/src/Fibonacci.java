import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),a=0,b=1,i;
        for (i = 2; i <= n ; i++) {
            int temp=b;
            b+=a;
            a=temp;
        }
        System.out.println(b);
    }
}
