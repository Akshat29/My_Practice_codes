public class subarray_with_min_max {
    public static void main(String[] args){
        int[] A = {377,448,173,307,108};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int min=A[0];
        int max=0;
        int min_i = -1;
        int max_i = -1;
        int ans = 10^7;
        for(int i=0 ; i<A.length ; i++){
            if(A[i]<min){
                min=A[i];
            }
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println("min > "+min+" ,max > "+max);
        for(int i=0 ; i<A.length ; i++){
            if(A[i]==min){
                min_i=i;
                if(max_i!=-1){
                    System.out.println(Math.abs(min_i-max_i)+1);
                    ans=Math.min(Math.abs(min_i-max_i)+1,ans);
                }
            }
            if(A[i]==max){
                max_i=i;
                if(min_i!=-1){

                    ans=Math.min(Math.abs(min_i-max_i)+1,ans);
                }
            }
        }
        return ans;
    }
}
