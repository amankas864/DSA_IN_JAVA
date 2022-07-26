import java.util.Arrays;

public class MaxRev {
    public static void main(String[] args) {
        int[] arr = {1,2,3,78,8,4,5};
        System.out.println(Arrays.toString(arr));
        max(arr);
        rev(arr);
    }

    private static void rev(int[] arr) {

        for (int i = 0,end= arr.length; i < end-1; i++,end--) {
            arr[i]+=arr[end-1];
            arr[end-1]=arr[i]-arr[end-1];
            arr[i]-=arr[end-1];
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void max(int[] arr) {
        int var=Integer.MIN_VALUE;
        System.out.println(var);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>var){
                var=arr[i];
            }
        }
        System.out.println(var);
    }

}
