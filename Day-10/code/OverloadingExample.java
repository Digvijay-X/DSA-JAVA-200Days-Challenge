class OverloadingExample {
    // int type function
    static int add(int a, int b) {
        return a + b;
    }

    // double type function
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));        // int wala chalega
        System.out.println(add(5.5, 2.3));     // double wala chalega
    }
}
