import java.util.ArrayList;
import java.util.Scanner;

public class subarrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            A.add(sc.nextInt());
        }
        ArrayList<ArrayList<Integer>> answer = findsub(A);
        for(int i=0 ; i<answer.size() ; i++) {
            System.out.println(answer.get(i));
        }

    }
    public static ArrayList<ArrayList<Integer>> findsub(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> finalans = new ArrayList<>();

        for (int i=0 ; i<A.size() ; i++){ //to change the start value
            for(int j=i ; j<A.size() ; j++){ // from every start value to end of the array
                ArrayList<Integer> ans = new ArrayList<>();
                for(int k=i ; k<=j ; k++){
                    ans.add(A.get(k));
                }
                finalans.add(ans);
            }
        }
        return finalans;
    }
}
