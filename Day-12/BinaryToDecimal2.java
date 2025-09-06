public class BinaryToDecimal2 {
    public static void main(String[] args) {
        int binary = 1011;  // binary number
        int decimal = 0, power = 0;

        while (binary > 0) {
            int lastDigit = binary % 10; // rightmost digit
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary /= 10; // remove last digit
        }

        System.out.println("Decimal value: " + decimal);
    }
}
