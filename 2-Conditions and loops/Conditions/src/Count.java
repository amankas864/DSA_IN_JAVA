public class Count {
    public static void main(String[] args) {
        int a=46465,count=0;
        System.out.println(a);
        while (a>0){
            int r = a%10;
            if (r==4){
                count++;
            }
            a/=10;
        }
        System.out.println(count);

    }
}
