public class SelectionSort {
    public static void main(String[] args) {
    int[] arr={3,2,1};
    selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max=0;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[max])
                    max=j;
            }
            arr[max]=arr[max]+arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[max]-arr[arr.length-i-1];
            arr[max]-=arr[arr.length-i-1];


        }


    }

}
