public class min_in_sorted_array {
    public static void main(String[] args){
        int[] arr =  {14,15,20,22,3,5,7,9,11};
        int beg = 0;
        int end = arr.length-1;
        while(beg<end){
            int mid = (beg+end)/2;
            if (arr[mid] < arr[end]){
                end = mid;
            }
            else {
                beg = mid+1;
            }
        }
        System.out.println(arr[beg] );
    }
}
