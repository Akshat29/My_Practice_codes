/*
Description

Problem Description
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
The digits are stored such that the most significant digit is at the head of the list.
NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :
Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


Problem Constraints
1 <= size of the array <= 1000000


Input Format
First argument is an array of digits.


Output Format
Return the array of digits after adding one.


Example Input
Input 1:
[1, 2, 3]


Example Output
Output 1:
[1, 2, 4]


Example Explanation
Explanation 1:
Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.
 */

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class add_1_to_integers_forming_number_in_array {
    public static void main(String[] args){
        int[] A = {0,0,9,0,9,0};
        int[] ans=plusone(A);
        for(int i=0 ; i< ans.length ; i++){
            System.out.print(ans[i]);
        }
    }
    public static int[] plusone(int[] A){
        ArrayList<Integer> answer = new ArrayList<>();
        int l=0;
        int r=A.length-1;
        while (l<r){
            int temp=A[l];
            A[l] = A[r];
            A[r] = temp;
            l++;
            r--;
        }
        int value=0;
        int carry=0;
        for(int i=0 ; i<A.length ; i++){
            if(i==0){
                value=A[i];
                A[i]=(value+1+carry)%10;
                carry=(value+1+carry)/10;
            }
            else {
                value=A[i];
                A[i] = (value  + carry) % 10;
                carry = (value  + carry) / 10;
            }
        }
        for(int i=0 ; i<A.length ; i++){
            answer.add(A[i]);
        }
        if(carry!=0){
            answer.add(carry);
        }
        while(answer.size()>0 && answer.get(answer.size()-1)==0){
            answer.remove(answer.size()-1);
        }
        int[] finalans = new int[answer.size()];
        for(int i=0 ; i<answer.size() ; i++){
            finalans[i]=answer.get(i);
        }
        l=0;
        r=finalans.length-1;
        while (l<r){
            int temp=finalans[l];
            finalans[l] = finalans[r];
            finalans[r] = temp;
            l++;
            r--;
        }


        return finalans;
    }
}
