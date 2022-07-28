public class Tdim {
    public static void main(String[] args) {
        int[][] arr = {{12,3,5},{6,4,8,9},{78,6,19}};
        System.out.println(lsearch(arr,19));
    }

    private static String lsearch(int[][] a, int b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==b)
                    return (i+1)+" "+(j+1);
            }

        }
        return "No such Value";
    }
}
