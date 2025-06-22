import java.util.Scanner;

public class replaceexcept0 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String s2="";
        s2=s.substring(1);
        String s3=s2.replace(s.charAt(0),'$');
        String s4=s.charAt(0)+s3;
        System.out.println(s4);
    }
}
