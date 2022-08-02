import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(BSearch(matrix,in.nextInt())));

    }
    static int[] BSearch(int[][] matrix,int target){
        int r=0;
        int c=matrix.length-1;
        while(r< matrix.length&&c>=0){
            if (matrix[r][c]==target){
                return new int[]{r+1,c+1};
            } else if (matrix[r][c]<target) {
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
