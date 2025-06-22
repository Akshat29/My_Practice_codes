/*
DESCRIPTION :

Problem Description
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".


Problem Constraints
0 <= sum of length of all strings <= 1000000


Input Format
The only argument given is an array of strings A.


Output Format
Return the longest common prefix of all strings in A.


Example Input
Input 1:
A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:
A = ["abab", "ab", "abcd"];


Example Output
Output 1:
"a"
Output 2:
"ab"
 */

public class longest_common_prefix {
    public static void main(String[] args){
        String[] A = {"abcdefgh", "aefghijk", "abcefgh"};
        System.out.println(longestCommonPrefix(A));
    }
    public static String longestCommonPrefix(String[] A) {
        String ans="";
        int len=Integer.MAX_VALUE;
        for(int i=0 ; i<A.length ; i++){
            if(A[i].length()<len){
                len=A[i].length();
            }
        }

        boolean flag = true;
        for(int i=0 ; i<len ; i++){
            char ch = A[0].charAt(i);
            for(int j=0 ; j<A.length ; j++){
                if(A[j].charAt(i)!=ch){
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            else
                ans+=ch;

        }
        return ans;
    }
}
