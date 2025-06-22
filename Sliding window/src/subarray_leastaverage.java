public class subarray_leastaverage {
    public static void main(String[] args){
        int[] A = {20,3,13,5,10,14,8,5,11,9,1,11};
        int B = 9;
        System.out.print(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        float lavg=Integer.MAX_VALUE;
        int index=0;
        float avg=0;
        long sum=0;
        for(int i=0 ; i<B ; i++){
            sum+=A[i];
        }
        avg=(float)sum/B;
        if(avg<lavg){
            lavg=avg;
        }
        System.out.println("first lavg > "+lavg);
        int s=1;
        int e=B;
        while(e<A.length){
            sum=sum-A[s-1]+A[e];
            System.out.println("start > "+s+" end > "+e);
            System.out.println("Sum> "+sum);
            avg=(float)sum/B;
            System.out.println("avg > "+avg);
            if(avg<lavg){
                lavg=avg;
                index=s;
                System.out.println("lavg > "+lavg+" sum > "+sum+" index > "+index);
            }
            s++;
            e++;

        }
        return index;
    }
}
