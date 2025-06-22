public class majorityelement_nby3 {
    public static void main(String [] args){
        int[] A = {1,1,1,2,3,5,7};
        System.out.println(majorityElement(A));
    }
    public static int majorityElement(final int[] A) {
        if(A.length==1){
            return A[0];
        }
        int t_ans1=A[0];
        int count1=0;
        int t_ans2=A[1];
        int count2=0;
        for(int i=2 ; i<A.length ; i++){
            if(count1==0){
                t_ans1=A[i];
                count1=1;
            }
            else if(count2==0){
                t_ans2=A[i];
                count2=1;
            }
            else if(A[i]==t_ans1){
                count1++;
            }
            else if(A[i]==t_ans2){
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        int freq1=0;
        int freq2=0;
         for(int i=0 ; i<A.length ; i++){
             if(A[i]==t_ans1){
                 freq1++;
             }
             else if(A[i]==t_ans2){
                 freq2++;
             }
         }
         if(freq1>(A.length)/3){
             return t_ans1;
         }
         if(freq2>(A.length)/3){
             return t_ans2;
         }
         return -1;
    }
}
