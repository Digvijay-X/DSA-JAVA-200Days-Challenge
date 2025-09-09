// Question 4 : READ & CODE EXERCISE
// Search & use the following methods of the Math class in Java:
// a. Math.min( ) 
// b. Math.max( ) 
// c. Math.sqrt( ) 
// d. Math.pow( ) 
// e. Math.avg( )  --> Note: Math.avg() does not exist in Java (we calculate manually)
// f. Math.abs( )

public class MathMethods {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Math.min(10,20): " + Math.min(a, b));
        System.out.println("Math.max(10,20): " + Math.max(a, b));
        System.out.println("Math.sqrt(16): " + Math.sqrt(16));
        System.out.println("Math.pow(2,3): " + Math.pow(2, 3));
        System.out.println("Average of 10 and 20 (manual): " + (a + b) / 2.0);
        System.out.println("Math.abs(-25): " + Math.abs(-25));
    }
}
