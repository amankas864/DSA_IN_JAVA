public class Rotated {
    public static void main(String[] args) {
        int[] arr={9,10,12,0,1,5,6,8};
        int target=6;
        System.out.println(RotatedArray(arr,target));
    }

    private static int RotatedArray(int[] arr, int target) {
        int pivot=Pivot(arr);
        int a =BinarySrch(arr,target,0,pivot);
        if (a!=-1)
            return a;
        else
            a=BinarySrch(arr,target,pivot+1, arr.length-1);

        return a;
    }

    private static int Pivot(int[] arr) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid<arr.length-1&&arr[mid]>arr[mid+1])
                return mid;
            else if (mid>start&&arr[mid]<arr[mid-1])
                return mid-1;
            else if (arr[mid]<=arr[start])
                end=mid-1;
            else start=mid+1;

        }
        return arr.length-1;
    }

    private static int BinarySrch(int[] a,int b,int start,int end) {
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == b)
                return mid;
            else if (b > a[mid])
                    start = mid + 1;
                else
                    end = mid - 1;

        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
