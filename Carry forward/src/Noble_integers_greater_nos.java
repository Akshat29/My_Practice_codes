import java.util.Arrays;

public class Noble_integers_greater_nos {
    public static void main(String[] args){
        int[] A = {0,0,0,3,4,5};  //1,2,3,3,3,4,4,4
        int ans=solve(A);
        System.out.println(ans);
    }
    public static int solve(int[] A) {
        Arrays.sort(A);
        int temp=0;
        int ans=0;
        int count=0;
        int i=0;
        int j=A.length-1;


//        reversing the sorted array
        while(i<j){
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }

        if(A[0]==0){
            ans++;
        }
        for(int k=1 ; k<A.length ; k++){
            if(A[k-1]!=A[k]){
                count=k;
            }
            if(count==A[k]){
                ans++;
                System.out.println(A[k]);
            }
        }
        if(ans>0)
            return ans;
        else
            return -1;
    }
}
