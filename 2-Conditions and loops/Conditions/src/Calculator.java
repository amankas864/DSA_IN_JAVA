import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res=0;
        while (true){
            System.out.println("Enter the operator : ");
            char ch = in.next().trim().charAt(0);
            System.out.println("Enter the two no.s : ");
            int a = in.nextInt(),b=in.nextInt();
            if (ch=='+'){
                res=a+b;
            }else if (ch=='-'){
                res=a-b;
            } else if (ch=='*') {
                res=a*b;
            } else if (ch=='/') {
                res=a/b;
            } else if (ch=='x') {break;}
            else {
                System.out.println("Wrong operator");
            }
            System.out.println(res);
        }
    }
}
