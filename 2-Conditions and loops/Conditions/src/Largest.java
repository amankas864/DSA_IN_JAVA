import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // Find the largest no.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b= in.nextInt(), c = in.nextInt();
//        int max=a;
//        if (b>a) {max=b;} if (c>a) {max=c;}
        System.out.println(Math.max(c,Math.max(a,b)));
    }
}
