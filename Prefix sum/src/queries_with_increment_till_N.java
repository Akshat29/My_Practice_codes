public class queries_with_increment_till_N {
    public static void main(String[] args){
        int[][] B = {{3,4},{1,3},{4,-2}};
        int[] A = new int[8];
        int[] ans = solve(A,B);
        for(int i=0 ; i<ans.length ; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] solve(int[] A, int[][] B) {
        int[] ar = new int[A.length];
        for(int q=0 ; q<B.length ; q++){
            int start = B[q][0];
            int val = B[q][1];
            ar[start]+= val;
        }
        for(int i=1 ; i<A.length ; i++){
            ar[i] = ar[i] + ar[i-1];
        }
        return ar;
    }
}
