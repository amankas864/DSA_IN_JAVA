public class Mountain {
    public static void main(String[] args) {
        int[] a= {0, 1, 0};
        System.out.println(peakIndexInMountainArray(a));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) end=mid;
            else start=mid+1;}
        return start;
    }

    public int findInMountainArray(int target, int[] arr) {
        int peak =peakIndexInMountainArray(arr);
        int a=BinarySearchp(arr,target,peak);
        if (a!=-1)
            return a;
        else {
            a=BinarySearch(arr,target,peak);
            return a;
        }

    }
    private static int BinarySearchp(int[] a,int b,int p) {
        int start=0,end=p,mid;
        while (start<=end) {
            mid = start + (end - start) / 2;
            if (a[mid] == b)
                return mid;

            if (b > a[mid])
                start = mid + 1;
            else
                end = mid - 1;

        }
        return -1;
    }
    private static int BinarySearch(int[] a,int b,int p) {
        int start=p+1,end=a.length-1,mid;
        while (start<=end) {
            mid = start + (end - start) / 2;
            if (a[mid] == b)
                return mid;

            if (b < a[mid])
                start = mid + 1;
            else
                end = mid - 1;

        }
        return -1;
    }
}
