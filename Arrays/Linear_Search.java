import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println ("Enter the key to found");
        int k= sc.nextInt();
        int ans =-1;
        for (int i=0; i<n; i++){
            if(arr[i]==k){
                ans = i;
                break;
            }

        }
        System.out.println(k+" is found at "+ ans);
    }
}
