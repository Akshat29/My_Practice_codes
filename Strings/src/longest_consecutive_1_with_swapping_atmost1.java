public class longest_consecutive_1_with_swapping_atmost1 {
    public static void main(String[] args){
        String A = "111000";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        int count_1=0;
        for(int i=0 ; i<A.length() ; i++){
            if(A.charAt(i)=='1'){
                count_1++;
            }
        }
        if(count_1==0){
            return 0;
        }
        if(count_1==A.length()){
            return A.length();
        }
        int ans=0;
        for(int i=0 ; i<A.length() ; i++){
            if(A.charAt(i)=='0'){
                int l=i-1;
                int r=i+1;
                int count_l=0;
                int count_r=0;
                while(l>=0 && A.charAt(l)=='1'){
                    count_l++;
                    l--;
                }
                while(r<A.length() && A.charAt(r)=='1'){
                    count_r++;
                    r++;
                }
                int max=0;
                int leftover = count_1-count_l-count_r;
                if(leftover>=1){
                    max=count_l+count_r+1;
                }
                else
                    max=count_l+count_r;
                ans=Math.max(ans,max);
            }
        }
        return ans;
    }
}
