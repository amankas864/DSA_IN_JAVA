public class EvenQue {
    public static void main(String[] ar) {
        int[] nums ={12,345,2,6,7896} ;
        int count=0;
        for (int i :nums) {
            if(Math.log10(i)+1 %2==0)
                count+=1;
            System.out.println((int)(Math.log10(i)+1) %2==0);
        }
        System.out.println(count);
    }

    private static boolean evendigits(int i) {
        int count=0;
        while (i>0){
            i/=10;count++;
        }
        return  (count%2==0);

    }

}
