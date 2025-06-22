//public class Print_decreasing_order {
//    public static void main(String[] args){
//        DecThenInc(5);
//    }
//    public static void DecThenInc(int A) {
//        if(A==1){
//            System.out.print("1");
//            return;
//        }
//        System.out.print(A+" ");
//        DecThenInc(A-1);
//    }
//}

public class Print_decreasing_order {
    public static void main(String[] args){
        DecThenInc(3);
        System.out.println();
    }
    public static void DecThenInc(int A) {
        if(A==1){
            System.out.print("1 1 ");
            return;
        }
        System.out.print(A+" ");
        DecThenInc(A-1);
        System.out.print(A+" " );
    }
}
