import java.util.Scanner;

public class print_column {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] a = new int[rows][cols];
        System.out.print("enter the elements of array : ");
        for (int i=0 ; i< a.length ; i++){
            for (int j=0 ; j<a[i].length; j++ ){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Actual arragements of elements are : ");
        for (int i=0 ; i< a.length ; i++){
            for (int j=0 ; j<a[i].length; j++ ){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        int row = a.length;
        int col = a[0].length;
        System.out.print("Column wise elements are : ");
        for (int j=0 ; j<col ; j++){
            for (int i=0 ; i<row; i++ ){
                System.out.print(a[i][j]+ " ");
            }
        System.out.println();
        }
    }

}
