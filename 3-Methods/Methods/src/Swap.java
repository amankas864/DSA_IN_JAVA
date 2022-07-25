public class Swap {
    public static void main(String[] args) {
        int a=0,b=9;
        System.out.println("a:"+a+"\nb:"+b);
        swap(a,b);
    }

    private static void swap(int a, int b) {
        a+=b;b=a-b;a-=b;

        System.out.println("a:"+a+"\nb:"+b);
    }
}
