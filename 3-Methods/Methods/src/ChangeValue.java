import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={5, 6, 6, 3, 4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] alias) {
        alias[3]=9;
    }
}
