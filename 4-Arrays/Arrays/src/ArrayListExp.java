import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>(10);
        lst.add(56);
        lst.add(5);
        lst.add(6);
        lst.add(65);
        System.out.println("lst = " + lst);
        lst.set(2,656);
        lst.remove(3);
        for (int i = 0; i <5; i++) {
            lst.add(in.nextInt());
        }
        System.out.println();
        for (Integer integer : lst) {
            System.out.print(integer + " ");
        }
    }
}
