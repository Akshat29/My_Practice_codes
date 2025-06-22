import java.util.Scanner;

public class palindromestr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // to generate the reverse of str
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if(str.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
