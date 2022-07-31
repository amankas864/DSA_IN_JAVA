public class FnLPosition {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
    int[] res={-1,-1};
    res[0]=search(nums,target,true);
    res[1]=search(nums,target,false);
    return res;
    }

    private int search(int[] a, int b, boolean c) {
        int ans=-1;
        int start=0,end=a.length-1,mid;
        while (start<=end) {
            mid = start + (end - start) / 2;
            if (b > a[mid])
                    start = mid + 1;
            else if (b<a[mid])
                    end = mid - 1;
            else{
                ans=mid;
                if (c)
                    end=mid-1;
                else
                    start=mid+1;
            }


        }
        return ans;
    }
}
