// Q10: Write a function that returns the largest element in an array.
public class Q10_LargestArray {
    static int largestInArray(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 2, 8};
        System.out.println("Largest element: " + largestInArray(arr));
    }
}
