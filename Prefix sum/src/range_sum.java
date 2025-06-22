public class range_sum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[][] que = {{0,3},{1,2}};
        int[] ans=rangeSum(arr,que);
        for(int k=0 ; k<ans.length ; k++){
            System.out.print(ans[k]+" ");
        }
    }
    public static int[] rangeSum(int[] A, int[][] B) {
        int[] pf = new int[A.length];
        int[] range = new int[B.length];
        pf[0]=A[0];
        for(int i=1 ; i<A.length ; i++){
            pf[i]=pf[i-1]+A[i];
        }
        for(int j=0 ; j<B.length ; j++){
            int sum=0;
            int l=B[j][0];
            int r=B[j][1];
            if(l>0) {
                sum = pf[r] - pf[l - 1];
            }
            else{
                sum = pf[r];
            }
            range[j]=sum;
        }
        return range;
    }
}

