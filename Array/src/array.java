import java.sql.SQLOutput;

public class array {
    public static void main(String[] args){
        int [][] a = {
                {2,5,1,7},
                {1,2,3,4},
                {4,5,67,78}
        };
        for (int i=0 ; i<a.length ;i++){
            for (int j=0 ; j<a[i].length ; j++){
                System.out.print(a[i][j]+ " ");
            }
        System.out.println();
        }
    }
}
