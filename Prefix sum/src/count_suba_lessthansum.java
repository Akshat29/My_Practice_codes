public class count_suba_lessthansum {
    public static void main(String[] args){
        int[] A = {2,5,6};
        int B =10 ;
        System.out.print(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        int count=0;
        int[] pf = new int[A.length];
        pf[0] = A[0];
        for(int i=1 ; i<A.length ; i++){
            pf[i] = pf[i-1] + A[i];
        }
        for(int i=0 ; i<A.length ; i++){
            int sum = 0;
            for(int j=i ; j<A.length ; j++){
                if(i>0){
                    sum=pf[j]-pf[i-1];
                }
                else
                    sum=pf[j];
                if(sum<B){
                    count++;
                }
            }

        }
        return count;
    }
}
