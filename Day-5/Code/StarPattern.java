 
public class StarPattern {
    public static void main(String[] args) {
        // simple 5x5 star square pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println(); // next line
        }
    }
}
