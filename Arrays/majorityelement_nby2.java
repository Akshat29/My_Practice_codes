public class majorityelement_nby2 {
    public static void main(String [] args){
        int[] A = {2,1,2};
        System.out.println(majorityElement(A));
    }
    public static int majorityElement(final int[] A) {
        int t_ans=A[0];
        int count=0;
        for(int i=0 ; i<A.length ; i++){
            if(count==0){
                t_ans=A[i];
                count=1;
            }
            else if(A[i]==t_ans){
                count++;
            }
            else
                count--;
        }
        // int freq=0;
        // for(int i=0 ; i<A.length ; i++){
        //     if(A[i]==t_ans){
        //         freq++;
        //     }
        // }
        return t_ans;
    }
}
