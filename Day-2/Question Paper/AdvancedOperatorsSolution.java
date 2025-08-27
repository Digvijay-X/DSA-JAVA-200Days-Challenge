public class AdvancedOperatorsSolution {
    public static void main(String[] args) {

        int a = 5, b = 10, c = 3;
        a += b - a++ * c + --b;
        System.out.println("Q1 - a = " + a);

        int x = 15, y = 4, z = 3;
        int result = x / y + x % y * z - ++y;
        System.out.println("Q2 - result = " + result);

        int i = 2, j = 3;
        boolean flag = i++ * j > j++ + --i;
        System.out.println("Q3 - flag = " + flag);
        System.out.println("Q3 - i = " + i + ", j = " + j);

        int p = 5, q = 10, r = 15;
        int max = (p > q) ? p : (q > r ? q : r);
        System.out.println("Q4 - max = " + max);

        int m = 5, n = 9;
        boolean flag2 = ((m & 1) == 1) && ((n | 2) > 10);
        System.out.println("Q5 - flag2 = " + flag2);

        int a1 = 7, b1 = 4, c1 = 2;
        int ans = a1-- + ++b1 * c1 / b1 - c1 % a1;
        System.out.println("Q6 - ans = " + ans);
        System.out.println("Q6 - a1 = " + a1 + ", b1 = " + b1 + ", c1 = " + c1);

        int x1 = 8, y1 = 3, z1 = 5;
        int finalResult = x1++ - --y1 + z1 * x1 % y1;
        System.out.println("Q7 - finalResult = " + finalResult);
        System.out.println("Q7 - x1 = " + x1 + ", y1 = " + y1 + ", z1 = " + z1);
    }
}
