public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {7,8,9,0,4,5,6};
        int pivot=Pivot(arr);
        System.out.println("Rotation count = " + (pivot+1));
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
}
