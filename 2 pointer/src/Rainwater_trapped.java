/*
DESCRIPTION:

Problem Description
Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.

Your task is to calculate the total amount of water that can be trapped in these valleys.

Example:

The Array A = [5, 4, 1, 4, 3, 2, 7] is visualized as below. The total amount of rain water trapped in A is 11.


Rain Water Trapped




Problem Constraints
1 <= |A| <= 105
0 <= A[i] <= 105



Input Format
First and only argument is the Integer Array, A.



Output Format
Return an Integer, denoting the total amount of water that can be trapped in these valleys



Example Input
Input 1:

 A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

1 unit is trapped on top of the 3rd element.
Rain Water Histogram
Explanation 2:

No water is trapped.
 */
//**************************************** BRUTE FORCE ****************************************
//public class Rainwater_trapped {
//    public static void main(String[] args){
//        int[] A={1,2};
//        System.out.println(trap(A));
//    }
//    public static int trap(final int [] A){
//        int ans=0;
//        int[] Lmax = new int [A.length];
//        int[] Rmax = new int [A.length];
//        int tempL=0;
//        int tempR=0;
//        for(int i=0 ; i<A.length ; i++){
//            if(A[i]>tempL){
//                tempL=A[i];
//            }
//            Lmax[i]=tempL;
//        }
//        for(int j=A.length-1 ; j>=0 ; j--){
//            if(A[j]>tempR){
//                tempR=A[j];
//            }
//            Rmax[j]=tempR;
//        }
//        for(int i=0 ; i<A.length ; i++){
//            int min = Math.min(Lmax[i],Rmax[i]);
//            ans+=min-A[i];
//        }
//        return ans;
//    }
//}


//**************************************** OPTIMISED APPROACH ****************************************
//********************************************* 2POINTER ****************************************


public class Rainwater_trapped {
    public static void main(String[] args){
        int[] A={0,1,0,2};
        System.out.println(trap(A));
    }
    public static int trap(final int [] A){
        int ans=0;
        int l=0;
        int r=A.length-1;
        int lmax=0;
        int rmax=0;
        while(l<r){
            if(A[l]>lmax){
                lmax=A[l];
            }
            if(A[r]>rmax){
                rmax=A[r];
            }
            if(lmax<rmax){
                ans+=lmax-A[l];
                l++;
            }
            else{
                ans+=rmax-A[r];
                r--;
            }
        }
        return ans;
    }
}
