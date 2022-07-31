public class INFarr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target=10;
        start(arr,target);
    }

    private static void start(int[] arr, int target) {
        int start=0,end=1;
        while (target > arr[end]) {
            int temp=end+1;
            end+= (end-start+1)*2;
            start=temp;
        }
        findIndex(arr,target,start,end);
    }

    private static void findIndex(int[] a, int b, int start, int end) {
        int ans=-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == b)
                ans=mid;

            if (b > a[mid])
                start = mid + 1;
            else
                end = mid - 1;

        }
        System.out.println(ans);
    }

}
