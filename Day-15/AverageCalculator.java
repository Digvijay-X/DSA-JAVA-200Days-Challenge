// Question 1 : Write a Java method to compute the average of three numbers.

public class AverageCalculator {
   
    public static double averageOfThree(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        int x = 10, y = 20, z = 30;
        System.out.println("Average of " + x + ", " + y + ", " + z + " = " + averageOfThree(x, y, z));
    }
}
