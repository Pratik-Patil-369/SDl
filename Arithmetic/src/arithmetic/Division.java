package arithmetic;

public class Division {
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return 0;
        }
        return (double) a / b;
    }
}
