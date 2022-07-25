import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        foo(4,4,"name","variables");
        foo(6,89,56);
    }

    private static void foo(int i, int i1, int i2) {
        System.out.println("i = " + i + ", i1 = " + i1 + ", i2 = " + i2);
    }

    private static void foo(int a,int b, String ...c) {
        System.out.println("a = " + a + ", b = " + b + ", c = " + Arrays.deepToString(c));
    }
}
