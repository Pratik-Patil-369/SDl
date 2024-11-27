package mathoperations1;

public class MainProgram {
    public static void main(String[] args) {
        // Using fully qualified name
        mathoperations.Calculator calc = new mathoperations.Calculator();

        int sum = calc.add(10, 5);
        System.out.println("Sum: " + sum);

        int difference = calc.subtract(10, 5);
        System.out.println("Difference: " + difference);
    }
}
