import java.util.ArrayList;
import java.util.Scanner;

/*
BRUTE FORCE METHOD

complexities :

TIME : O(N^3)
SPACE : O(1)


 */
//public class maxsum_subarray {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> A = new ArrayList<>();
//        int n = sc.nextInt();
//        for(int i=0 ; i<n ; i++){
//            A.add(sc.nextInt());
//        }
//        ArrayList<ArrayList<Integer>> answer = maxsum(A);
//        for(int i=0 ; i<answer.size() ; i++) {
//            System.out.println(answer.get(i));
//        }
//
//    }
//    public static ArrayList<ArrayList<Integer>> maxsum(ArrayList<Integer> A) {
//        ArrayList<ArrayList<Integer>> finalans = new ArrayList<>();
//        int maxsum=0;
//        for (int i=0 ; i<A.size() ; i++){ //to change the start value
//            for(int j=i ; j<A.size() ; j++){ // from every start value to end of the array
//                ArrayList<Integer> ans = new ArrayList<>();
//                int sum=0;
//                for(int k=i ; k<=j ; k++){
//                    ans.add(A.get(k));
//                    sum+=A.get(k);
//                    if(sum>maxsum){
//                        maxsum=sum;
//                    }
//                }
//                finalans.add(ans);
//            }
//        }
//        System.out.println("maxsum > "+maxsum);
//        return finalans;
//    }
//}

/*

//**************************************************************************************************************************************************************
OPTIMISED APPROACH - PREFIX SUM

complexities :

TIME : O(N^2)
SPACE : O(N)  - because of creation of extra space for pf array.
 */

//public class maxsum_subarray {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> A = new ArrayList<>();
//        int n = sc.nextInt();
//        for(int i=0 ; i<n ; i++){
//            A.add(sc.nextInt());
//        }
//        System.out.println(maxsum(A));
//
//    }
//    public static int maxsum(ArrayList<Integer> A) {
//        int pf[] = new int[A.size()];
//        pf[0] = A.get(0);
//        for(int i=1 ; i<pf.length ; i++){
//            pf[i] = pf[i-1] + A.get(i);
//        }
//        int maxsum=0;
//        for (int i=0 ; i<A.size() ; i++){ //to change the start value
//            for(int j=i ; j<A.size() ; j++) { // from every start value to end of the array
//                int sum = 0;
//                if (i > 0) {
//                    sum = pf[j] - pf[i-1];
//                } else
//                    sum = pf[j];
//                if (sum > maxsum) {
//                    maxsum = sum;
//                }
//            }
//            }
//        return maxsum;
//    }
//
//}

//**************************************************************************************************************************************************************
/*
2nd OPTIMISED APPROACH - CARRY FORWARD

complexities :

TIME : O(N^2)
SPACE : O(1)  - because now we are calculating sum of subarrays on the go

*/

public class maxsum_subarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            A.add(sc.nextInt());
        }
        System.out.println(maxsum(A));

    }
    public static int maxsum(ArrayList<Integer> A) {
        int maxsum=0;
        for (int i=0 ; i<A.size() ; i++){ //to change the start value
            int sum = 0;
            for(int j=i ; j<A.size() ; j++) { // from every start value to end of the array
                sum+=A.get(j);
                if(maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        return maxsum;
    }

}