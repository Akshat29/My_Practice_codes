public class callstack{
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Inside main(), x = " + x);
        first();
    }
    static void first (){
        int x = 10;
        System.out.println("Inside first(), x = " + x);
        second () ;
    }
    static void second () {
        int x = 20;
        System.out.println("Inside second(), x =" + x);
        third();
    }
    static void third() {
        int x = 30;
        System.out.println("Inside third(), x = " + x);
    }
}