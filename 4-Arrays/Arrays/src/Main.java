import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[3];             //default_value : 0
        String[] str = new String[8];       //default_value : null

        int[] ar1 = {1,3,89,45};
        arr[0]=9;
        System.out.println(arr[1]+ Arrays.toString(ar1));

    }
}