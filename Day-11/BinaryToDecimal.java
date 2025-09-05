public class BinaryToDecimal {

    static int binaryToDecimal(int binary) {
        int decimal = 0;
        int base = 1; // 2^0 = 1

        while (binary > 0) {
            int lastDigit = binary % 10;   // last digit nikala
            decimal = decimal + lastDigit * base;
            base = base * 2; // next power of 2
            binary = binary / 10; // next digit ke liye
        }

        return decimal;
    }

    public static void main(String[] args) {
        int binary = 1011;
        int decimal = binaryToDecimal(binary);
        System.out.println("Binary: " + binary + " → Decimal: " + decimal);
    }
}
