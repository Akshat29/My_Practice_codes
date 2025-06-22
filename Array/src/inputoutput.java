import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] dim2 = new int [rows][columns];
        for (int i=0 ; i<dim2.length ; i++){
            for (int j=0 ; j<dim2[i].length ; j++){
                dim2[i][j] = sc.nextInt();
            }
        }

        for (int i=0 ; i<dim2.length ; i++){
            for (int j=0 ; j<dim2[i].length ; j++){
                System.out.print(dim2[i][j]+ " ");
            }
        System.out.println();
        }


    }
}
