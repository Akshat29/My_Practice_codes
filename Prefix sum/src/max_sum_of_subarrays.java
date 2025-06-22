import java.util.*;
import java.util.Scanner;

public class max_sum_of_subarrays {
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
        int pf[] = new int[A.size()];
        pf[0] = A.get(0);
        for(int i=1 ; i<pf.length ; i++){
            pf[i] = pf[i-1] + A.get(i);
        }
        int maxsum=0;
        for (int i=0 ; i<A.size() ; i++){ //to change the start value
            for(int j=i ; j<A.size() ; j++) { // from every start value to end of the array
                int sum = 0;
                if (i > 0) {
                    sum = pf[j] - pf[i-1];
                } else
                    sum = pf[j];
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
            }
        return maxsum;
    }
}
