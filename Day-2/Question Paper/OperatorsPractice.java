public class OperatorsPractice {
    public static void main(String[] args) {

        int a = 10, b = 3;
        int c = a + b;
        c -= 2;
        c *= b;
        c /= a;
        c %= b;
        System.out.println("Q1 - Final c = " + c);

        int x = 7, y = 2;
        int result1 = x / y;
        int result2 = x * (y / x);
        System.out.println("Q2 - " + result1 + " , " + result2);

        int p = 5, q = 10;
        System.out.println("Q3 - p > q: " + (p > q));
        System.out.println("Q3 - p <= q: " + (p <= q));
        System.out.println("Q3 - p == q: " + (p == q));
        System.out.println("Q3 - p != q: " + (p != q));

        boolean flag1 = true, flag2 = false;
        System.out.println("Q4 - flag1 && flag2: " + (flag1 && flag2));
        System.out.println("Q4 - flag1 || flag2: " + (flag1 || flag2));
        System.out.println("Q4 - !flag1: " + (!flag1));
        System.out.println("Q4 - !flag2: " + (!flag2));

        int i = 5, j = 10;
        System.out.println("Q5 - ++i: " + (++i));
        System.out.println("Q5 - j--: " + (j--));
        System.out.println("Q5 - i + j: " + (i + j));

        int m = 4, n = 3;
        int ans = m + n * 2 - m / n + (m % n);
        System.out.println("Q6 - Answer = " + ans);
    }
}
