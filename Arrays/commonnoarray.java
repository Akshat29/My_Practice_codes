import java.util.Scanner;

public class commonnoarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a= new int[5];
        int[] b= new int[5];
        int[] c= new int[5];
        System.out.println("Enter array 1 elements: ");
        for (int i=0; i<5; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter array 2 elements: ");
        for (int j=0; j<5; j++){
            b[j]= sc.nextInt();
        }
        for (int i=0; i<5; i++){
            for (int j=0; j<5 ;j++){
                if (a[i]==b[j]){
                    c[j]=b[j];
                }
            }
        }
        System.out.println(" Common elements are: ");
        for (int i=0; i<5 ; i++){
            System.out.println(c[i]);
        }
    }
}
