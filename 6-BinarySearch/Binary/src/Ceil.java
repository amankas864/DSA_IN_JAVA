public class Ceil {
    //return the ceiling of the num if num not found
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18,20,22,25,26,30,40,50,60};
        int target=15;
        System.out.println(Bsearch(arr,target));
    }

    public static int Bsearch(int[] arr, int target) {
        int s=0,e= arr.length-1, m=0;
        while (s<=e){
            m=s+(e-s)/2;
            if (arr[m]==target)
                return arr[m];
            else if (target>arr[m])
                s=m+1;
            else e=m-1;
        }
        return arr[m+1];//return arr[s]
        //arr[m] or arr[e] for the floor of the number
    }
}
