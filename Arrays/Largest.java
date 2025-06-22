import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int largest=0;
        for (int i=0;i<size;i++){
            int current = sc.nextInt();
            if (current>largest){
                largest=current;
            }
        }
        System.out.println("largest no is:"+largest);
    }
}
