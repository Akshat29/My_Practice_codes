import java.lang.*;
import java.util.*;

public class vowel_cos {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String vowel="aeiou";
        for(int i=0 ; i<n ; i++){
            int v =0;
            int c =0;
            String A = sc.next();
            for(int j=0 ; j<A.length() ; j++){
                for(int k=0 ; k<vowel.length() ; k++){
                    if(A.charAt(j)==vowel.charAt(k)){
                        v++;
                    }
                }
            }
            c= A.length() - v;
            System.out.println(v+" "+c);
        }
    }
}
