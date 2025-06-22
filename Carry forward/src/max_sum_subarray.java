import java.util.ArrayList;
import java.util.Scanner;

public class max_sum_subarray {
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
