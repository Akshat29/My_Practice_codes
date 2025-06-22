import java.sql.SQLOutput;

public class rotateby180 {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(" Original matrix is : ");
        for (int i = 0 ; i< arr.length ; i++){
            for (int j=0 ; j< arr[i].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        rotateby180(arr);

    }


    public static void rotateby180(int[][] arr){
        for(int i =0 ; i< arr.length ; i++) {
            for (int j = i+1 ; j< arr[i].length; j++ ){
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }

        System.out.println(" Transposed matrix is : ");
        for (int i = 0 ; i< arr.length ; i++){
            for (int j=0; j< arr[i].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

// swapping of rows - >
        int top = 0, bottom= arr.length-1;
        while (top<bottom) {
            for (int i = 0; i < arr[0].length; i++) { // since we want to swap the row elements with the target column's row element ., thats why we used here i for traversing row
                int temp = arr[top][i];
                arr[top][i] = arr[bottom][i];
                arr[bottom][i] = temp;
            }
            top++;
            bottom--;
        }
        System.out.println(" Rotated matrix is : ");
        for (int i = 0 ; i< arr.length ; i++){
            for (int j=0 ; j< arr[i].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
