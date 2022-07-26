import java.util.Arrays;
import java.util.Scanner;

public class LinearSrch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums={5,3,7,9,89,76,18,59,37};
        int target=in.nextInt();
        String res = linearsearch(nums,target,1,6);
        System.out.println("nums = " + Arrays.toString(nums) + res);
        
    }

    private static String linearsearch(int[] a, int b,int s,int e) {
        for (int i = s; i <= e; i++) {
            int j = a[i];
            if (j == b)
                return "\nTrue at "+i;
        }
        return "None";
    }
}
