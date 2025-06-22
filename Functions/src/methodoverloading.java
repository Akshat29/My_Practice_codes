public class methodoverloading {
        static int add(int a, int b) {
            System.out.println("Inside first add");
            return a + b;
        }

        static String add(String a, String b) {
            System.out.println("Inside second add");
            return a + b;
        }

        public static void main(String[] args) {
            System.out.println(add(3,4));
            System.out.println(add("Good Morning"," Riya"));
        }
}
