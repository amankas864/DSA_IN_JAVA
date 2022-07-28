public class EvenQue {
    public static void main(String[] ar) {
        int[] nums ={12,345,2,6,7896} ;
        int count=0;
        for (int i :nums) {
            if(evendigits(i))
                count+=1;
        }
        System.out.println(count);
    }

    private static boolean evendigits(int i) {
        int count=0;
        while (i>0){
            i/=10;count++;
        }
        if (count%2==0)
            return true;
        return false;
    }

}
