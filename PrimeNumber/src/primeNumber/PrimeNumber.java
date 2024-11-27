package primeNumber;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if number is prime
        boolean isPrime = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
        
        scanner.close();
    }
}
