public class Min {
    public static void main(String[] ar){
        int[] arr = new int[]{12,3,5,6,4,8,9,78,6,19};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
        int minv=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minv) {
                minv=arr[i];
            }
        }
        return minv;
    }
}
