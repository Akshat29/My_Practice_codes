/*
DESCRIPTION :

Problem Description
Given two binary strings A and B. Return their sum (also a binary string).


Problem Constraints
1 <= length of A <= 105
1 <= length of B <= 105
A and B are binary strings


Input Format
The two argument A and B are binary strings.


Output Format
Return a binary string denoting the sum of A and B
 */

public class Bits_Addition {
    public static void main(String[] args){
        String A = "110";
        String B = "11";
        System.out.println(addBinary(A,B));
    }
    public static String addBinary(String A, String B) {
        String reva="";
        String revb="";
        for(int i=A.length()-1; i>=0 ; i--){
            reva = reva+A.charAt(i);
        }
        for(int i=B.length()-1; i>=0 ; i--){
            revb = revb+B.charAt(i);
        }



        String sum="";
        int len= Math.max(reva.length(),revb.length());
        int carry=0;
        for(int i=0 ; i<len ; i++){
            int add = 0;
            int vala =0 ;
            int valb =0;
            if(i<reva.length()){
                vala = (reva.charAt(i)-'0');
            }
            if(i<revb.length()){
                valb = (revb.charAt(i)-'0');
            }
            add = (carry + vala + valb) % 2;
            carry = (carry + vala + valb) / 2;

            if(i!=len-1) {
                //    if(a>0 && b>0) {
                sum=add+sum;
            }
            else if(i==len-1){
                sum=add+sum;
                if(carry!=0)
                    sum=carry+sum;
            }
        }
        return sum;
    }
}
