class SmallestLetter{
    public static void main(String[] args) {
        System.out.println(2%2);
    }
    private static int BinarySrch(int[] a,int b) {
        int start=0,end=a.length-1,mid;
        while (start<=end) {
            mid = start + (end - start) / 2;
            if (b < a[mid])
                    end = mid - 1;
            else
                    start = mid + 1;

            }

        return a[start%a.length];
    }
}