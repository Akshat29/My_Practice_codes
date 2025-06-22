/*
DESCRIPTION : Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.
 */


/*
Time : O(N2)
Space :  O(1)
Technique : Carry forward

the reason i chose this, is that I dont have to store the sum of subarrays.
 */

public class goodsubarray {
    public static void main(String[] args){
        int[] A = {1,2,3,4,5};
        int B = 4;
        System.out.print(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        int goodsubarray=0;
        for(int i=0 ; i<A.length ; i++){
            int sum=0;
            int count=0;
            for(int j=i ; j<A.length ; j++){
                sum+=A[j];
                count++;
                if(sum<B && count%2==0){
                    goodsubarray++;
                }
                else if(sum>B && count%2==1){
                    goodsubarray++;
                }
                else
                    continue;
            }
        }
        return goodsubarray;
    }
}
