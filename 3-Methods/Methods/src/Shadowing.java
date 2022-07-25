public class Shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        int x=80;
        System.out.println(x);
    }
}
