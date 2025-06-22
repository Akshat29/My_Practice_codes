import java.util.Scanner;

public class array {
    public static void main(String[] args){
        int[] marks = new int [10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10; i++){
            marks[i]= i*5;
        }
        System.out.println(marks[2]);
        System.out.println(marks[5]);
        System.out.println(marks[8]);
    }
}
