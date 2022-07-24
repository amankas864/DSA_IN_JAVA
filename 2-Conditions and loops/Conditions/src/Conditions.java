import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sal = in.nextInt();
        if (sal>80) {
            sal+=20;
        }else if (sal<60){
            sal+=15;
        }else{
            sal+=10;
        }
        System.out.println(sal);
    }
}