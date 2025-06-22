import java.util.Scanner;

public class arrayofnno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] natural = new int[n];
        for (int i=0; i<n ;i++){
            natural[i]=i;
        }
        for (int num: natural ){
            System.out.println(num*num);
        }
    }
}
