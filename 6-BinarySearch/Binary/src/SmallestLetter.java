class SmallestLetter{
    public static void main(String[] args) {
        char[] a={'a','b','v'};
        char b='j';
        System.out.println(BinarySrch(a,b));
    }
    private static int BinarySrch(char[] a,char b) {
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