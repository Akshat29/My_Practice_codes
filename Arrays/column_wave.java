import java.util.Scanner;

public class column_wave {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] a = {{4, 1, 2}, {7, 4, 4},{ 3, 7, 4}};
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n ; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for (int i=0 ; i<n ; i++){
            if(i%2==0){
                for (int j=0 ; j<n ; j++){
                    System.out.print(a[j][i]+" ");
                }
            }
            else{
                for (int j=a.length-1 ; j>=0 ; j--){
                    System.out.print(a[j][i]+" ");
                }
            }
        }
    }
}
