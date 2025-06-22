import java.util.Scanner;

/*
APPROACH 1ST :
 */
public class Pattern16 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<=2*i-1 ; k++){
                if(k!=2*i-1){
                    if(k%2==1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
APPROACH 2ND ;
 */
//public class testing {
//    public static void main(String[] args) {
//        // YOUR CODE GOES HERE
//        // Please take input and print output to standard input/output (stdin/stdout)
//        // DO NOT USE ARGUMENTS FOR INPUTS
//        // E.g. 'Scanner' for input & 'System.out' for output
//        Scanner scn = new Scanner(System.in);
//
//        int n = scn.nextInt();
//
//        // Loop for N rows
//        for(int i=1;i<=n;i++){
//
//            // Print n-i spaces
//            for(int j=1;j<=n-i;j++) {
//                System.out.print(" ");
//            }
//
//            // Print i+1 stars
//            for(int j=1;j<=i;j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//}
