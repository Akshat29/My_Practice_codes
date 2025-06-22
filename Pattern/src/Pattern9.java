import java.util.Scanner;


/*
for n=3, in each row, we have
spaces + row = N i.e 3.
Therefore, spaces required to print till : n-i
 */

public class Pattern9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n ; i++){
            System.out.print("*");
            for(int j=1; j<=n-i; j++){
                System.out.print("_");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
