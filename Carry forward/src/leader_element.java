public class leader_element {
    public static void main(String[] args){
        int[] A = {377,448,173,307,108};

        int[] fin = solve(A);
        System.out.print("fin/result array > ");
        for(int i=0 ; i<fin.length; i++){
            System.out.print(fin[i]+" ");
        }
    }
    public static int[] solve(int[] A) {
        int size = A.length;

        int[] ans = new int[size];
        int max_from_right = A[size - 1];
        int count = 0;
        ans[count++] = max_from_right;

        for (int i = size - 2; i >= 0; i--) {
            if (max_from_right < A[i]) {
                ans[count++] = A[i];
                max_from_right = A[i];
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = ans[i];
        }
        System.out.print("Ans array > ");
        for(int i=0 ; i<ans.length ; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        System.out.println();
        return result;
    }
}




