public class count_positive_profits {
    public static void main(String[] args){
        int[] A = {1,-1,0};
        int[][] B = {{0,2},{1,2}};
        int[] ans = count_profit(A,B);
        for(int i=0 ; i<ans.length ; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] count_profit(int[] A,int[][] B){
        int[] ans = new int[B.length];
        for(int i=0 ; i<B.length ; i++){
            int count=0;
            int start=B[i][0];
            int end=B[i][1];
            for(int j=start ; j<=end ; j++){
                if(A[j]>=0){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
