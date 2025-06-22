import java.util.HashMap;

/*
Given an array of size N and an integer 'target'. Find the indices (i,j) of two numbers such that thier sum is equal to target.
(i!=j) and there is only one solution.
 */
public class two_sum {
    public static void main(String[] args){
        int[] arr = {11,3,7,9,14,2};
        int target = 17;
        int[] ans = new int [2];
        HashMap<Integer,Integer> map = new HashMap();
        for (int i = 0 ; i < arr.length ; i++){
            int sno = target - arr[i];
            if (map.containsKey(sno)){
                ans[0]= map.get(sno);
                ans[1]= i;
                break;
            }
            map.put(arr[i],1);
        }
        System.out.println(ans[0]+ " " + ans[1]);

    }
}
