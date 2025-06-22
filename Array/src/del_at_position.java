import java.lang.*;
import java.util.*;
/*
FIRST APPROACH BY SELF
 */
//public class del_at_position {
//    public static void main(String[] args) {
//        // YOUR CODE GOES HERE
//        // Please take input and print output to standard input/output (stdin/stdout)
//        // DO NOT USE ARGUMENTS FOR INPUTS
//        // E.g. 'Scanner' for input & 'System.out' for output
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        int del = sc.nextInt();
//        int[] b=remove(a,del);
//        for(int i=0 ; i<b.length ; i++){
//            System.out.print(b[i]+" ");
//        }
//    }
//    public static int[] remove(int[] a, int del) {
//        int[] b = new int[a.length-1];
//        for(int j=0 ; j< del-1 ; j++){
//            b[j]=a[j];
//        }
//        for (int i = del - 1; i < b.length ; i++) {
//            b[i] = a[i + 1];
//        }
//        return b;
//    }
//}
/*
------------------------------------------------------------------------
SECOND APPROACH BY SELF
 */
public class del_at_position {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int del = sc.nextInt();
        remove(a,del);
        n=n-1;
        for(int i=0 ; i<n ; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int[] remove(int[] a, int del) {
        for (int i = del - 1; i < a.length-1 ; i++) {
            a[i] = a[i + 1];
        }
        return a;
    }
}