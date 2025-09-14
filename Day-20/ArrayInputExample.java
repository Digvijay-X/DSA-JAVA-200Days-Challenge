import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array ka size input lo
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Array declare
        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output elements
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
