public class Overloading {
    public static void main(String[] args) {
        demo("Tupac");
        demo(98);
    }

    private static void demo(String tupac) {
        System.out.println("String = " + tupac);
    }

    private static void demo(int i) {
        System.out.println("int = " + i);
    }
}
