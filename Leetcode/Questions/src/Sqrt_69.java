import java.util.Scanner;

public class Sqrt_69 {
    public static void main(String[] args) {while (true){
        Scanner in =new Scanner(System.in);
        int a=46340,b=in.nextInt();
        int i=0;
        do {
            if ( (long)i*(long)i >b ){
                a=i-1;
                break;
            }
            i=nxtsq(++i);
        }while(i<=b+1);
        System.out.println(a+" "+Math.pow(b,0.5));
        System.out.println(Integer.MIN_VALUE);
//        System.out.println(4.0%1);
    }}

    private static int nxtsq(int i) {
        if (i%1==0)
            return i;
        else
            return nxtsq(i++);

    }
}
