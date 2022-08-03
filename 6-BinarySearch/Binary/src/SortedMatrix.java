import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(search(matrix,in.nextInt())));
    }
    public static int[] binarySearch(int[][] matrix,int row,int cols,int cole,int target){
        while(cols<=cole){int mid = cols + (cole-cols)/2;

            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            } else if (matrix[row][mid]<target) {
                cols=mid+1;
            }else {
                cole=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] search(int[][] matrix,int target){
        int rows= matrix.length;
        int cols= matrix[0].length;
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows==1){
            binarySearch(matrix,0,0,cols-1,target);
        }


        int rowsstart=0;
        int rowsend=rows-1;
        int col=cols/2;

        while (rowsstart< rowsend-1){
            int midr=rowsstart+ (rowsend-rowsstart)/2;
            if (matrix[midr][col]==target){
                return new int[]{midr,col};
            }
            else if (matrix[midr][col]<target){
                rowsstart=midr;
            }else {
                rowsend=midr;
            }
            
        }

        if (matrix[rowsstart][col] == target) {
            return new int[]{rowsstart, col};
        }
        if (matrix[rowsstart + 1][col] == target) {
            return new int[]{rowsstart + 1, col};
        }

        // search in 1st half
        if (target <= matrix[rowsstart][col - 1]) {
            return binarySearch(matrix, rowsstart, 0, col-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rowsstart][col + 1] && target <= matrix[rowsstart][cols - 1]) {
            return binarySearch(matrix, rowsstart, col + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rowsstart + 1][col - 1]) {
            return binarySearch(matrix, rowsstart + 1, 0, col-1, target);
        } else {
            return binarySearch(matrix, rowsstart + 1, col + 1, cols - 1, target);
        }
    }
}
