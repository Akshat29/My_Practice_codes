public class row_col_sum {
    public static void main(String[] args){
        int[][] A = {{1,2},{4,5},{8,9}};
        int[] answer = new int [A.length+A[0].length];
        solve(A);
        for(int i=0 ; i<answer.length ; i++){
            System.out.print(answer[i]+" ");
        }
    }
    public static int[] solve(int[][] A) {
        int total_len = A.length + A[0].length;
        int[] sum = new int [total_len];
        for(int i=0 ; i<A.length ; i++){
            int value=0;
            for(int j=0 ; j<A[0].length ; j++){
                value=value+A[i][j];
            }
            sum[i]=value;
        }
        int start = total_len - A[0].length;
        for(int i=0 ; i<A.length ; i++){
            int count=0;
            for(int j=0 ; j<A[0].length ; j++){
                count=count+A[j][i];
            }
            sum[start]=count;
            start++;
        }

        return sum;
    }

}