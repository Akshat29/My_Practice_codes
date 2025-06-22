import java.util.Scanner;

public class search_in_rotated {
    public static void main(String[] args){
        int[] arr = {9,11,14,15,20,22,25,2,3,5,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element you want to search : ");
        int target = sc.nextInt();
        /*
        First step is finding the minimum element so as to divide the rotated array in two sub arrays of sorted ascending arrays.
         */
        int minindx = findMin(arr);
        /*
        Now we are searching in the left sorted ascending array the target element.
         */
        int answer = binary_search(arr,0, minindx-1,target);
        /*
        Here we are checking if we still havnt got the target element in the left side, then search again in right side by passing new parameters to
        Binary search function.
         */
        if (answer==-1){
            answer = binary_search(arr, minindx ,arr.length-1,target);
        }
        System.out.println(answer);
    }
    public static int findMin(int[] arr){
        int beg = 0;
        int end = arr.length-1;
        while(beg<end){
            int mid = (end+beg)/2;
            if (arr[mid]<arr[end]){
                end = mid;
            }
            else {
                beg = mid+1;
            }
        }
        return beg;

    }

    public static int binary_search(int[] arr, int beg, int end, int target){
        int ans = -1;
        while(beg<=end){
            int mid = (end+beg)/2;
            if (arr[mid]==target){
               ans = mid;
               return ans;    // Quesition ? If I dont return my answer here at this stage then it is going in infinite loop.
            }
            else if(arr[mid]<target){
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}
