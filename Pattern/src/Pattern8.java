import java.util.Scanner;
// 1ST APPROACH :
/*
rows are increasing, stars in rows are decreasing.
row+star = n+1
star = n+1-row
star = n+1-i

so for ith row, we have the formula to print.
 */

//public class Pattern8 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1 ; i<=n ; i++){
//            for (int j=1 ; j<=(n+1-i) ; j++){
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


// 2ND APPROACH
public class Pattern8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n ; i>=1 ; i--){
            for (int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
