import java.util.Arrays;

public class FuntionArray {
    public static void main(String[] args) {
        int[] nums = {6,9,2,0,4};
        System.out.println("Nums = " + Arrays.toString(nums));
        change(nums);
        System.out.println("Nums = " + Arrays.toString(nums));
    }

    private static void change(int[] nums) {
        nums[2]=69;
    }
}
