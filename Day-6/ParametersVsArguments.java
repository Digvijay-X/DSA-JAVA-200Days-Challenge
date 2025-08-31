


public class ParametersVsArguments {
    static void display(int number) {   // "number" = Parameter
        System.out.println("Number is: " + number);
    }

    public static void main(String[] args) {
        display(100); // 100 = Argument
    }
}
