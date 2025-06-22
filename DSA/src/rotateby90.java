import java.sql.SQLOutput;

public class rotateby90 {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},
                       {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        System.out.println(" Original matrix is : ");
        for (int i = 0 ; i< arr.length ; i++){
            for (int j=i+1 ; j< arr[i].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        rotateby90(arr);
    }


// transpose of a matrix is achieved by below code - >
    public static void rotateby90(int[][] arr){
        for(int i =0 ; i< arr.length ; i++) {
            for (int j = 0 ; j< arr[i].length; j++ ){
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
        System.out.println("Transposed matrix is ");

        for (int i = 0 ; i< arr.length ; i++){
            for (int j=0 ; j< arr[i].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
// swapping of columns - >
        int left = 0, right= arr[0].length-1;
        while (left<right) {
            for (int i = 0; i < arr.length; i++) { // since we want to swap the row elements with the target column's row element ., thats why we used here i for traversing row
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }

        System.out.println("Final rotated matrix is: ");
        for (int i = 0 ; i< arr.length ; i++){
            for (int j=0 ; j< arr[i].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
