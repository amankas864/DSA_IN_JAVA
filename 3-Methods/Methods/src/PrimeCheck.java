import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean i=IsPrime(in.nextInt());
        System.out.println(i);
    }

    private static boolean IsPrime(int i) {
        if (i <= 1) {
            return false;
        }
        int c=2;
        while (c*c<=i){
            if (i%c==0) {
                return false;
            }c++;
        }
        return c*c>i;
    }
}
