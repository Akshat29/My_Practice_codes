import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class freqofelement {
    public static void main(String [] args){
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        for(int i=0 ; i<n1 ;i++){
            A.add(sc.nextInt());
        }
        int n2 = sc.nextInt();
        for(int i=0 ; i<n2 ;i++){
            B.add(sc.nextInt());
        }
        answer = solve(A,B);
        for(int i=0 ; i<answer.size() ; i++){
            System.out.print(answer.get(i)+" ");
        }
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0 ; i<A.size() ; i++){
            int count=0;
            for(int j=0 ; j<A.size() ; j++){
                if(A.get(i).equals(A.get(j))){
                    count++;
                }
            }
            hm.put(A.get(i),count);
        }
        for(int i=0 ; i<B.size() ; i++){
            ans.add(hm.getOrDefault(B.get(i),0));
        }
        return ans;
    }
}
