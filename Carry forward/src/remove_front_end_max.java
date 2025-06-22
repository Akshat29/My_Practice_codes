/*
Brute force method :
 */

public class remove_front_end_max {
    public static void main(String[] args){
        int[] A = {5,-3,1,2,4};
        int B =3;
        int fin = solve(A,B);
        System.out.print(fin);
    }
    public static int solve(int[] A, int B) {
        int[] pf = new int[A.length];
        int[] sf = new int[A.length];
        int sum=0;
        pf[0]=A[0];
        sf[A.length-1]=A[A.length-1];
        for(int i=1 ; i<A.length ; i++){
            pf[i]=pf[i-1]+A[i];
        }
        for(int i=A.length-2 ; i>=0 ; i--){
            sf[i]=sf[i+1]+A[i];
        }
        int ans=Math.max(pf[B-1],sf[A.length-B]);
        for(int i=1 ; i<B ; i++){
            sum = pf[i-1] + sf [A.length-(B-i)];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
