public class transpose {
    public static void main(String[] args){
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};

        solve(A);
    }
    public static int[][] solve(int[][] A) {
        int temp=0;
        int[][] ans = new int[A.length][A[0].length];
        for(int i=0 ; i<A.length ; i++){
            for(int j=0 ; j<A[0].length ;j++){
                temp=ans[i][j];
                ans[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
        return ans;
    }
}