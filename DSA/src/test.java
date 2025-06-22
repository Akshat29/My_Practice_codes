import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] A = {9, 11, 14, 15, 20, 22, 25, 2, 3, 5, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element you want to search : ");
        int B = sc.nextInt();
        search(A,B);
    }
    public static int search(final int[] A, int B) {
        int minind = findmin(A);
        int answer = binary_search(A,0,minind,B);
        if (answer==-1){
            answer = binary_search(A,minind,A.length-1,B);
        }
        return answer;
    }
    public static int findmin(int[] A){
        int beg=0;
        int end=A.length-1;
        while(beg<end){
            int mid=(beg+end)/2;
            if(A[mid]<A[end]){
                end=mid;
            }
            else{
                beg=mid+1;
            }
        }
        return beg;
    }
    public static int binary_search(int[] A,int beg, int end, int B ){
        int ans=-1;
        while(beg<=end){
            int mid=(beg+end)/2;
            if(A[mid]==B){
                return mid;
            }
            else if(A[mid]<B){
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
