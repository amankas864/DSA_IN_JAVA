import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num = in.nextInt(),rev=0;
        while (num>0){
            int rem = num%10;
            rev*=10;
            rev+=rem;
            num/=10;
        }
        System.out.println(rev);
    }
}
