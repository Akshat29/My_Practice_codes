import java.util.Arrays;

public class minimum_cost_elements_removal {
    public static void main(String[] args) {
        int[] A = {2,1};
        int fin = solve(A);
        System.out.println(fin);
    }
    public static int solve(int[] A) {
        Arrays.sort(A);
        int[] pf = new int[A.length];
        pf[0] = A[0];
        for(int i=1 ; i<A.length ; i++){
            pf[i] = pf[i-1] + A[i];
        }
        int sum=0;
        for(int i=0 ; i<pf.length ; i++){
            sum+=pf[i];
        }
        return sum;
    }
}
