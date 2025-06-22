public class even_equals_odd {
    public static void main(String[] args){
        int[] A = {1,2,3,7,1,2,3};
        int ans=solve(A);
        System.out.print(ans);
    }
    public static int solve(int[] A) {
        int[] pf_e = new int[A.length];
        int[] pf_o = new int[A.length];
        pf_e[0]=A[0];
        for(int i=1 ; i<A.length ; i++){
            if(i%2==1) {
                pf_e[i] = pf_e[i - 1] + 0;
            }
            else{
                pf_e[i] = pf_e[i - 1] + A[i];
            }
        }
        pf_o[0]=0;
        for( int j=1 ; j<A.length ; j++){
            if(j%2==0){
                pf_o[j] = pf_o[j-1] ;
            }
            else{
                pf_o[j] = pf_o[j-1] + A[j] ;
            }
        }


        int count=0;
        for(int i=0 ; i<A.length ; i++){
            int so=0;
            int se=0;
            if(i>0) {
                so = pf_o[i - 1];
            }
            so+=pf_e[A.length-1]-pf_e[i];
            if(i>0) {
                se = pf_e[i - 1];
            }
            se+=pf_o[A.length-1]-pf_o[i];

            if(se==so){
                count++;
            }
        }
        return count;
    }
}
