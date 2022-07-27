import java.util.Arrays;
import java.util.Scanner;

public class StrSearch {

    //woohoo hOliday
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nums= "{5,3,7,9}";
        char target=in.next().trim().charAt(0);
        boolean res = linearsearch(nums,target);
        System.out.println("nums = " + nums + res);

    }

    private static boolean linearsearch(String a, char b) {
        for(int j=0;j<a.length();j++){
            if (a.charAt(j)==b)
                return true;
        }
        return false;
    }
}
