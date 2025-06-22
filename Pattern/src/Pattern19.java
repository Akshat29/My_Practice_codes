import java.util.Scanner;
/*
FIRST APPROACH BY ME
 */
public class Pattern19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;

        int elements = 0;
        for (int i=1 ; i<=n ; i++){
            int sum=0;
            for (int j=1 ; j<=2*n-1 ; j++) {
                if (j >= n - elements && j <= n + elements) {
                    if (i == 1) {
                        System.out.print(number+" ");
                    } else {
                        sum=sum+number;
                        System.out.print(sum+" ");
                    }
                } else {
                    System.out.print("0 ");
                }
            }
            number--;
            elements++;
            System.out.println();
        }
    }
}

/*
SECOND APPROACH BY SCALER
 */


//
//class Main {
//
//    public static void main(String args[]) {
//        Scanner scn = new Scanner(System.in);
//
//        int n = scn.nextInt();
//
//        // Loop for N rows
//        for (int i = 1; i <= n; i++)
//        {
//            // Print leading 0s
//            int spaces = n - i;
//            for (int j = 1; j <= spaces; j++){
//                System.out.print("0 ");
//            }
//            // Print non-zero number series
//            int lim = 2 * i - 1;
//            int cnt = 1;
//            for (int j = 1; j <= lim; j++)
//            {
//                System.out.print((n-i+1)*cnt + " ");
//                cnt++;
//            }
//            // Print trailing 0s
//            for (int j = 1; j <= spaces; j++){
//                System.out.print("0 ");
//            }
//            System.out.println();
//        }
//    }
//
//}
