import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first and second no. : ");
        int s1=in.nextInt(),s2=in.nextInt();
        return s1+s2;
    }
}
