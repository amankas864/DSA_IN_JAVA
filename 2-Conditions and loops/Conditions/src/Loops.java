import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for loop
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        //while loop
        int i=1;
        while (i<=n){
            System.out.println(i);i++;
        }

        //do while
        i=0;
        do {
            System.out.print("newline req.");
            i++;
        }while(i<n);
    }
}
