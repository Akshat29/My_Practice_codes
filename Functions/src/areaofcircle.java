import java.text.DecimalFormat;
import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        double ans = solve(A);
        System.out.print(ans);

    }
    public static double solve(int A) {
        double area = 3.1416*(A*A);
        return (Math.round(area*100)/100.0);
    }
}
