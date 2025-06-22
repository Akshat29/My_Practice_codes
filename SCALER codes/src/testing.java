/*
DESCRIPTION :

You are given a string S, and you have to find all the amazing substrings of S.
An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
Input
Only argument given is string S.
Output
Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
Constraints
1 <= length(S) <= 1e6
S can have special characters
Example
Input
    ABEC

Output
    6

Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6.
 */


/*
 ************************************************  Normam Method ************************************************
 */

public class testing {
    public static void main(String[] args){
        String A = "aaaabaaa";
        System.out.println(longestPalindrome(A));
    }
    public static String longestPalindrome(String A) {
        String finalstring="";
        int ans=0;
        int[] values = new int[3];
        int l=0;
        int r=0;
        int max=0;
        for(int i=0 ; i<A.length() ; i++){
            values=expand(A,i,i);
            if(values[0]>max){
                max=values[0];
                l=values[1];
                r=values[2];
            }
        }
        for(int i=0 ; i<A.length() ; i++){
            values=expand(A,i,i+1);
            if(values[0]>max){
                max=values[0];
                l=values[1];
                r=values[2];
            }
        }
        for(int i=l ; i<r ; i++){
            finalstring+=A.charAt(i);
        }
        return finalstring;
    }
    public static int[] expand(String A, int L, int R){
        int[] value = new int[3];
        while(L>=0 && R<A.length()){
            if(A.charAt(L) == A.charAt(R)){
                L--;
                R++;
            }
            else
                break;
            value[0]=R-L-1;
            value[1]=L;
            value[2]=R;
        }
        return value;
    }
}