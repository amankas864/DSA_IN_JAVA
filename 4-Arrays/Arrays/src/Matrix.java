import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[6][];// col not required
        arr = new int[][]{
                {4,3,},
                {5,89,6,34},
                {49,6,3,2,1,23,3,3,3,3,3,3,3,5,}
        };
        for (int[] i:arr) {
            System.out.println(Arrays.toString(i));
        }

    }
}
