/*
Given an array. You need to find the majority element in the array. Majority element
is defines as the element which is appearing more than n/2 times in the aray
of legth n.
Note - if there is no majority element, return -1
 */
public class majority_element {
    public static void main(String[] args){
        int[] arr = {5,7,4,7,4,4,5,4,4,7,4,4};
        int votes = 1;
        int candidate = arr[0];
        for (int i =1 ; i< arr.length ; i++){
            if(arr[i]==candidate){
                votes++;
            }
            else {
                votes--;
                if(votes==0){
                    candidate=arr[i];
                    votes=1;
                }
            }
        }
        int count =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]== candidate){
                count+=1;
            }
        }
        if (count > (arr.length/2)){
            System.out.println(candidate);
        }
        else
            System.out.println(-1);
    }
}
