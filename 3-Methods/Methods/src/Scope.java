public class Scope {
    public static void main(String[] args) {
        int a=80;
        String name = "Deepu";
        {
            a=90;
            System.out.println(a);
            name="Niku";
            System.out.println(name);
        }
        System.out.println(a+name);
    }
}
