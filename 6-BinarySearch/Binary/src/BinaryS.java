import java.util.Arrays;
import java.util.Scanner;

public class BinaryS {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7},arr2 = {1,2,3,4,5,6,7,8};
        Scanner in = new Scanner(System.in);
        System.out.print("Enterthetarget:");
        int target = in.nextInt();
        System.out.println(Arrays.toString(arr1));
        //int index=BinarySrch(arr2,5);
        System.out.println(Arrays.binarySearch(arr1,target));
        System.out.println(BinarySrch(arr1,target));
        System.out.println(Arrays.binarySearch(arr2,target));
        System.out.println(BinarySrch(arr2,target));
    }

    private static int BinarySrch(int[] a,int b) {
        int start=0,end=a.length-1,mid;
        while (start<=end){
            mid = start+ (end-start)/2;
            if (a[mid]==b)
                return mid;
            else if (b>a[mid]) {
                start=mid+1;
            } else if (b<a[mid]) {
                end=mid-1;
            }
        }
        return -1;
    }
}
