import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i=1 ; i<=n ; i++){
            char alpha ='A';
            for (int j=1 ; j<=i ; j++){
                if(j%2==1) {
                    System.out.print(alpha + " ");
                    alpha++;
                }
                else
                    System.out.print("_");
            }

            System.out.println();
        }
    }
}
