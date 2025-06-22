import java.util.Scanner;

public class minmaxarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i=0 ;i<n ;i++){
            numbers[i]=sc.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE ;
        for (int i=0; i<n; i++){
            if (numbers[i]>biggest){
                biggest=numbers[i];
            }
            if (numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest no is: "+smallest);
        System.out.println("biggest no is : "+biggest);
    }
}
