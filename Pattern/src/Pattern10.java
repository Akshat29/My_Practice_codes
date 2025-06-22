import java.util.Scanner;
/*
Here in this pattern,
__*
_**
***

we first print spaces, to calculate,
spaces + row = 3
spaces = 3- row
spaces = n-i

then for stars,
row number = number of stars
 */
public class Pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1 ; i<=n ; i++){
            for(int j=1; j<=n-i ; j++){
                System.out.print("_");
            }
            for(int k=1 ; k<=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
