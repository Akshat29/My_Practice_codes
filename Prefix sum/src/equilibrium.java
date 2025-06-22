public class equilibrium {
    public static void main(String[] args){
        int[] A ={1,2,3,7,1,2,3};
        int ans=solve(A);
        System.out.println(ans);
    }
    public static int solve(int[] A) {
        int result =0;
        int count=0;
        int[] pf = new int[A.length];
        pf[0]=A[0];
        for(int i=1 ; i<A.length ; i++){
            pf[i]=pf[i-1] + A[i];
        }

        for(int i=0 ; i<A.length ; i++){
            int sr=0;
            int sl=0;
            if(i>0){
                sl=pf[i-1];
            }
            sr=pf[A.length-1]-pf[i];
            if(sl==sr){
                count++;
                result = i ;
            }
        }
        if(count>0) {
            return result;
        }
        else
            return -1;
    }
}
