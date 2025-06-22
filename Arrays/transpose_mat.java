public class transpose_mat {
    public static void main(String[] args){
        int[][] A = {{1,2},{4,5},{7,8}};
        int[][] fin = new int[A.length][A[0].length];
        for(int i=0 ; i<A.length ; i++){
            for(int j=0 ; j<A[0].length ; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println("--------");
        fin=solve(A);
        for(int i=0 ; i<fin.length ; i++){
            for(int j=0 ; j<fin[0].length ; j++){
                System.out.print(fin[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] solve(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] ans = new int[n][m];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m;j++){
                ans[i][j]=A[j][i];
            }
        }
        return ans;
    }
}