import java.util.Scanner;

/*
DESCRIPTION :

Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.
Substring of string A is A[i...j] where 0 <= i <= j < len(A)
Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
Incase of conflict, return the substring which occurs first ( with the least starting index).


Problem Constraints
1 <= N <= 6000


Input Format
First and only argument is a string A.


Output Format
Return a string denoting the longest palindromic substring of string A.


Example Input
Input 1:
A = "aaaabaaa"
Input 2:
A = "abba


Example Output
Output 1:
"aaabaaa"
Output 2:
"abba"


Example Explanation
Explanation 1:
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
Explanation 2:
We can see that longest palindromic substring is of length 4 and the string is "abba".

 */
public class longest_palindromic_substring {
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
        for(int i=l ; i<=r ; i++){
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
        }
        value[0]=R-L-1;
        value[1]=L+1;
        value[2]=R-1;
        return value;
    }
}
