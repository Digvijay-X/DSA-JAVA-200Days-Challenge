// Q5: Write a function that returns the average of three numbers.
public class Q5_Average {
    static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        double avg = average(5, 10, 15);
        System.out.println("Average: " + avg);
    }
}
