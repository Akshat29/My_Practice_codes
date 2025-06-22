import java.util.Scanner;

/*
Standard program approach:
 */

//public class fibonacci {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp= new int[n+1];
//        System.out.println(fibo(n,dp));
//    }
//    public static int fibo(int n ,int[] dp){
//        int ans;
//        if(n==0||n==1){
//            return n;
//        }
//
//        ans=fibo(n-1,dp)+fibo(n-2,dp);
//        return ans;
//    }
//}

/*
Dynamic programming - Top- Down approach - MEMORIZATION
 */
//public class fibonacci {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp= new int[n+1];
//        System.out.println(fibo(n,dp));
//    }
//    public static int fibo(int n ,int[] dp){
//        int ans;
//        if(n==0||n==1){
//            dp[n]=n;
//            return dp[n];
//        }
//        if(dp[n]!=0){
//            return dp[n];
//        }
//        ans=fibo(n-1,dp)+fibo(n-2,dp);
//        dp[n]=ans;
//        return dp[n];
//    }
//}

/*
Dynamic programming - Bottom up approach - TABULATION
 */
public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp= new int[n+1];
        System.out.println(fibo(n,dp));
    }
    public static int fibo(int n ,int[] dp){
        dp[0]=0;
        dp[1]=1;
        for(int i=2 ; i<dp.length ; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
