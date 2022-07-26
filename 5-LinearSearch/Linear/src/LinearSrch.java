import java.util.Arrays;
import java.util.Scanner;

public class LinearSrch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums={5,3,7,9};
        int target=in.nextInt();
        boolean res = linearsearch(nums,target);
        System.out.println("nums = " + Arrays.toString(nums) + res);
        
    }

    private static boolean linearsearch(int[] a, int b) {
        for(int j : a){
            if (j==b)
                return true;
        }
        return false;
    }
}
