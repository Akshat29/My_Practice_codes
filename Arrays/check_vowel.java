import java.util.Scanner;

public class check_vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch= sc.next().charAt(0);
        switch(ch) {
            case 'a','e','i','o','u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.print("It is a consonant");

        }

    }
}
