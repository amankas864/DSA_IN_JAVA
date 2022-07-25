import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (IsArm(i)) {
                System.out.print(i + " ");
            }
        }

    }

    private static boolean IsArm(int i) {
        int num=0,a=i;
        while (i>0){
            int rem = i%10;
            i/=10;
            num+= Math.pow(rem,3);
        }
        if (num==a){
            return true;
        }
        return false;
    }
}
