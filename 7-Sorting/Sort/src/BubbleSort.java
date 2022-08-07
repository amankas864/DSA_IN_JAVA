import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap=false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    arr[j]=arr[j]+arr[j-1];
                    arr[j-1]=arr[j]-arr[j-1];
                    arr[j]-=arr[j-1];
                    swap=true;
                }
            }
            if (!swap)
                break;
        }
    }

}