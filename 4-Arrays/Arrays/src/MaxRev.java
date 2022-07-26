public class MaxRev {
    public static void main(String[] args) {
        int[] arr = {1,2,38,4,5};
        max(arr);
    }

    private static void max(int[] arr) {
        int var=Integer.MIN_VALUE;
        System.out.println(var);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>var){
                var=arr[i];
            }
        }
        System.out.println(var);
    }
}
