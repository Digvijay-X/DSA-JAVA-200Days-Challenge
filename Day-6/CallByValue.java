


public class CallByValue {
    static void changeValue(int x) {
        x = 50;
    }

    public static void main(String[] args) {
        int num = 10;
        changeValue(num);
        System.out.println("Value of num: " + num); // still 10
    }
}
