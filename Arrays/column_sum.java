public class column_sum {
    public static void main(String[] args){
        int[][] arr = {{4,1},{1,3},{6,2}};
        int m = 3;
        int n = 2;
        int[] ans = new int[n];
        ans = solve(m, n, arr);
        for( int i=0 ; i<ans.length ; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] solve(int A, int B, int[][] C) {
        int[] sum_col = new int[B];
        int fill = 0;
        for( int i=0 ; i<B ; i++){
            for( int j=0 ; j<A ; j++){
                sum_col[fill]=sum_col[fill] + C[j][i];
            }
            fill++;
        }
        return sum_col;
    }
}
