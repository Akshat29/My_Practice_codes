public class spiral_matrix {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4,11,23,45,29},
                {5,6,7,8,12,11,23,24,21},
                {9,10,11,12,43,32,52,65},
                {13,14,15,16,21,31,41,51}};
        int rmin = 0, rmax=arr.length-1;
        int cmin = 0, cmax=arr[0].length-1;
        int n= arr.length;
        int m= arr[0].length;
        int count = 0;

        while(count<(n*m)) {

            for (int i = cmin; i<=cmax ; i++){
                System.out.print(arr[rmin][i]);
                count++;
            }



            rmin++;

            for (int i= rmin; i <=rmax ; i++){
                System.out.print(arr[i][cmax]);
                count++;
            }


            cmax--;




            for (int i= cmax ; i>=cmin ; i--){
                System.out.print(arr[rmax][i]);
                count++;
            }


            rmax--;





            for(int i= rmax; i>=rmin; i--){
                System.out.print(arr[i][cmin]);
                count++;
            }


            cmin++;


        }
        System.out.println(" count " + count);
    }
}
