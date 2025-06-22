public class identity {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static void main(String[] args){
        int[][] A = {{0,0,1},{0,1,0},{1,0,0}};
        int answer = solve(A);
        System.out.print(answer);
    }
    public static int solve(final int[][] A) {
        boolean nd = false;
        boolean d = false;
        for(int i=0 ; i<A.length ; i++){
            for(int j=0 ; j<A[0].length ; j++){
                if(i==j ){
                    if(A[i][j]==1){
                        d=true;
                    }
                }
                if(i!=j){
                    if(A[i][j]==0){
                        nd=true;
                    }
                }
            }
        }
        if (nd == true && d == true ){
            return 1;
        }
        else
            return 0;
    }
}
