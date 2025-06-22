import java.util.*;

public class first_and_last_index {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 5, 5, 5, 5, 8};
        int first = 0;
        int last = 0;
        int target = 5;
        Arrays.sort(arr);
        int beg = 0;
        int end = arr.length - 1;
        while (beg <= end) {
            int mid = (end + beg) / 2;
            if (arr[mid] == target) {
                first = mid;
                end=mid-1;
            }
            else if (arr[mid] < target) {
                beg = mid + 1;
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }
        }
        beg = 0;
        end = arr.length - 1;
        while (beg <= end) {
            int mid = (end + beg) / 2;
            if (arr[mid] == target) {
                last = mid;
                beg=mid+1;
            }
            else if (arr[mid] < target) {
                beg = mid + 1;
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }
        }
        System.out.println("First occurrence of " + target + " is: " + first);
        System.out.println("Last occurrence of " + target + " is: " + last);
    }
}

