import com.sun.security.jgss.GSSUtil;

public class test {
    public static void main(String[] args){
        int[] A = {1,2,3,1,1};
        System.out.println(repeatedNumber(A));
    }
    public static int repeatedNumber(int[] A) {
        int value=0;
        boolean flag=false;
        int[] pf = new int[A.length];
        for(int i=0 ; i<A.length ; i++){
            int count=0;
            for(int j=0 ; j<A.length ; j++){
                if(A[i]==A[j]){
                    count++;
                }
            }
            pf[i]=count;
        }
        for(int i=0 ; i<A.length ; i++){
            if(pf[i]>(A.length/3)){
                value=i;
                flag=true;
            }
        }
        if (flag)
            return A[value];
        else
            return -1;
    }
}
