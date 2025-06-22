public class mat_equal {
    public static void main(String[] args){
        int[][] A= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B= {{1,2,3},{4,5,6},{7,5,9}};
        System.out.print(solve(A,B));
    }
    public static int solve(int[][] A, int[][] B) {
        for(int i=0 ; i<A.length ; i++){
            for(int j=0 ; j<B.length ; j++){
                if(A[i][j]!=B[i][j]){
                    return 0;
                }
            }
        }
        return 1;

    }
}
