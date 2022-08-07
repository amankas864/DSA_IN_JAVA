import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int[] arr={3,2,1};
    selectionSort(arr);
        System.out.println("Array = " + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max=0;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[max])
                    max=j;
            }
            if (max==arr.length-i-1)
                continue;
            int temp =arr[max];
            arr[max]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;


        }


    }

}
