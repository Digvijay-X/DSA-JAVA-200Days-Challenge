public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);

        // Simple assignment
        a = 20;
        System.out.println("After simple assignment: a = " + a);

        // Compound assignment
        a += b;  // a = a + b
        System.out.println("After a += b: a = " + a);

        a -= 3;  // a = a - 3
        System.out.println("After a -= 3: a = " + a);

        a *= 2;  // a = a * 2
        System.out.println("After a *= 2: a = " + a);

        a /= 4;  // a = a / 4
        System.out.println("After a /= 4: a = " + a);

        a %= 3;  // a = a % 3
        System.out.println("After a %= 3: a = " + a);
    }
}
