public class WealthQue {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
    }
        static int maximumWealth(int[][] accounts) {
            int[] total=new int[accounts.length];
            for (int i=0;i<accounts.length;i++){
                total[i] = tot(accounts[i]) ;
            }
            return max(total);}
        static int tot(int[] i){
            int a=0;
            for (int b : i)
                a+=b;
            return a;
        }
        static int max(int[] i){
            int a=0;
            for (int b:i)
                if (b>a)
                    a=b;
            return a;
        }
}
