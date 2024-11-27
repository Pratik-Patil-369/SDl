package arithmetic1;

import arithmetic.Addition;
import arithmetic.Subtraction;
import arithmetic.Multiplication;
import arithmetic.Division;

public class MainProgram {
    public static void main(String[] args) {
        // Create objects of each arithmetic operation class
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        // Numbers to perform operations on
        int a = 10;
        int b = 5;

        // Perform and print arithmetic operations
        System.out.println("Addition: " + add.add(a, b));
        System.out.println("Subtraction: " + sub.subtract(a, b));
        System.out.println("Multiplication: " + mul.multiply(a, b));
        System.out.println("Division: " + div.divide(a, b));
    }
}
