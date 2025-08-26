public class TypePromotion {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        // In expressions, byte is promoted to int
        int result = b1 * b2;
        System.out.println("Result after type promotion: " + result);

        char c = 'A';  // ASCII value 65
        int promoted = c + 1; // char promoted to int
        System.out.println("Char + 1 = " + promoted);
    }
}
