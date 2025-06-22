import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n=a/2;
        int o=a/2;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=(n-i+1) ; j++) {
                System.out.print("*");
            }
            for(int k=1 ; k<=(i-1) ; k++){
                System.out.print("_");
            }
            for(int l=1 ; l<=(i-1) ; l++){
                System.out.print("_");
            }
            for(int m=1; m<=(n-i+1) ; m++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int p=1 ; p<=o ; p++){
            for(int e=1 ; e<=(p) ; e++) {
                System.out.print("*");
            }
            for(int f=1 ; f<=(o-p) ; f++){
                System.out.print("_");
            }
            for(int g=1 ; g<=(o-p) ; g++){
                System.out.print("_");
            }
            for(int h=1; h<=(p) ; h++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
