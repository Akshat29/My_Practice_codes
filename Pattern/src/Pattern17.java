import java.util.Scanner;
/*
FIRST APPROACH BY SELF
 */
public class Pattern17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=n;
        for(int i=1 ; i<=n ; i++){
            for( int j=count ; j>=1 ; j--){
                if(i==1){
                    System.out.print("*");
                }
                else {
                    if(j==count || j==1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            count--;
        }
    }
}

/*
SECOND APPROACH BY SCALER
 */

//class Main {
//
//    public static void main(String args[]) {
//        Scanner scn = new Scanner(System.in);
//
//        int n = scn.nextInt();
//
//        for(int i = 0; i < n; i++){
//
//            for(int j = 0; j < n-i; j++){
//
//                // If 1st row or 1st column or last column print star else print space
//                if(i == 0 || j == 0 || j == n-i-1){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.println();
//        }
//
//    }
//
//}
