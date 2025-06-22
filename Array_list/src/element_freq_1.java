import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class element_freq_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            A.add(sc.nextInt());
        }
        int ans = solve(A);
        System.out.println(ans);

    }
    public static int solve(ArrayList<Integer> A) {
        int count = 0;
        for(int i=0 ; i<A.size() ; i++){
            int freq=0;
            for(int j=0 ; j<A.size() ; j++){
                if(A.get(j).equals(A.get(i))){
                    freq++;
                }
            }
            if(freq==1){
                count++;
            }
        }
        return count;
        LinkedHashMap
    }
}
