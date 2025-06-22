import java.util.Scanner;

public class matrices_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] c = new int[row][col];
        System.out.println("Enter the elements for array a : ");
        for (int i=0 ; i<a.length ; i++){
            for (int j=0 ; j<a[i].length ; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements for array b : ");
        for (int i=0 ; i<b.length ; i++){
            for (int j=0 ; j<b[i].length ; j++){
                b[i][j] = sc.nextInt();
            }
        }

        for (int i=0 ; i<a.length ; i++){
            for (int j=0 ; j<a[i].length ; j++){
                c[i][j] = a[i][j] + b[i][j] ;
                System.out.print(c[i][j]+" ");
            }
        System.out.println();
        }
    }
}
