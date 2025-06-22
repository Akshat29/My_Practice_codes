import java.util.Scanner;

public class generate_square_spiral_matrix {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        generateMatrix(A);
//        for (int i=0 ; i<A; i++ ){
//            for (int j=0; j<A ; j++){
//                System.out.println(A[i][j]);
//            }
//        }
//    }
//    public int[][] generateMatrix(int A) {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A =  sc.nextInt();
        int rmin = 0, rmax = A-1;
        int cmin = 0, cmax = A-1;
        int count = 1;
        int n = A;
        int m = A;
        int[][]ans = new int[n][m];

        while(count<=n*m){
            // for top boundary
            for ( int i=cmin ; i<=cmax; i++){
                ans[rmin][i]=count;
                count++;
            }
            rmin++;
            // for right boundary
            for ( int i=rmin; i<=rmax; i++){
                ans[i][cmax]=count;
                count++;
            }
            cmax--;

            // for bottom boundary
            for (int i= cmax ; i>=cmin ; i--){
                ans[rmax][i]=count;
                count++;
            }
            rmax--;

            //for left boundary
            for (int i=rmax ; i>=rmin ; i--){
                ans[i][cmin]=count;
                count++;
            }
            cmin++;

        }
        for (int i = 0 ; i< ans.length ; i++){
            for (int j=0 ; j< ans[0].length ; j++) {
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
