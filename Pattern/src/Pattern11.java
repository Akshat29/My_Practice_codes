import java.util.Scanner;
/*
Here in this type of pattern,
for n=5
**********
****__****
***____***
**______**
*________*


we have to consider it into two diferent patterns, and
then combine them into a single one.
These are two staircase problems.

*****
****_
***__
**___
*____

for this,
print stars with formula - n-row+1
print spaces - i - 1


then second pattern >

*****
_****
__***
___**
____*

for this,
print spaces with formula - i-1
print stars - : n-row+1
 */
public class Pattern11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
    }
}
