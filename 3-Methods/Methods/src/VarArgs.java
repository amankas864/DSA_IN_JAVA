import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        foo(4,4,"name","variables");
    }

    private static void foo(int a,int b, String ...c) {
        System.out.println("a = " + a + ", b = " + b + ", c = " + Arrays.deepToString(c));
    }
}
