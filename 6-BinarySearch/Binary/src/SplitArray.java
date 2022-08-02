public class SplitArray {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int m=2;
        int largest=splitArr(arr,m);
        System.out.println("largest = " + largest);
    }

    private static int splitArr(int[] arr,int m) {
        int max=0;
        int min=0;
        for (int ar:arr) {
            max+=ar;
            min=Math.max(min,ar);
        }
//        System.out.println(max+" "+min);
        return BinarySearch(arr,m,min,max);


    }
    private static int BinarySearch(int[] a,int b,int start,int end) {
        while (start<end) {
            int mid = start + (end - start) / 2;
            int pieces=Pieces(a,mid);
            if (pieces<= b){
                end=mid;
            }else {
                start=mid+1;
            }

        }
        return end;
    }
    public static int Pieces(int[] arr,int mid){
        int pieces=1;
        int sum=0;
        for (int j : arr) {

            if (sum + j > mid) {
                pieces++;
                sum = j;
            } else {
                sum += j;
            }
        }
        return pieces;
    }

}
