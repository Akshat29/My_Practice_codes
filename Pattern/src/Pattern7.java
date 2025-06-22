import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0 ; i<n ; i++){
                System.out.print("*");
                int j = 1;
                while(j<=(n-2)) {
                    System.out.print("_");
                    j++;
                }
                System.out.print("*");
            System.out.println();
        }
    }
}
