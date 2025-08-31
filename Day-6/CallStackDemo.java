


public class CallStackDemo {
    static void fun1() {
        System.out.println("Inside fun1");
        fun2();
    }

    static void fun2() {
        System.out.println("Inside fun2");
    }

    public static void main(String[] args) {
        fun1();
        System.out.println("Back to main");
    }
}
