public class Transpose_sq_mat {
    public static void main(String[] args){
        int[][] A = {{1,2},{3,4}};
        System.out.println("Before Transpose > ");
        for(int i=0 ; i<A.length ; i++){
            for(int j=0 ; j<A[0].length ; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        int[][] ans = solve(A);
        System.out.println("After rotating > ");
        for(int i=0 ; i<ans.length ; i++){
            for(int j=0 ; j<ans[0].length ; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] solve(int[][] A) {
        for(int i=0 ; i<A.length ; i++){
            int temp=0;
            for(int j=0 ; j<i ; j++){
                temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }

        System.out.println("After Transpose > ");
        for(int i=0 ; i<A.length ; i++){
            for(int j=0 ; j<A[0].length ; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0 ; i<A.length ; i++){
            int s=0;
            int e=A[0].length-1;
            for(int j=0 ; j<A[0].length ; j++){

                while(s<=e){
                    int temp=A[i][s];
                    A[i][s]=A[i][e];
                    A[i][e]=temp;
                    s++;
                    e--;
                }
            }
        }
        return A;
    }
}
