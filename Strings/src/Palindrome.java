import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            String s = sc.next();
            System.out.print(isPalin(s));
        }
    }
    public static boolean isPalin(String s) {
        // complete the function template
        char[] a = s.toCharArray();
        String rev = "";
        for(int i=a.length-1 ; i>=0 ; i--){
            rev+=a[i];
        }
        if(s.equals(rev)){
            return true;
        }
        else
            return false;
    }
}