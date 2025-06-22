import java.util.Scanner;
/*
FIRST APPROACH BY SELF
 */
public class Pattern18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = n-1;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=1 ; k<=b ; k++){
            for (int l = 1; l <= b - k + 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

