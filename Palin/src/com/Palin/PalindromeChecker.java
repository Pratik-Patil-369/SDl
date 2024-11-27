package com.Palin;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number or string: ");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();

        boolean isPalindrome = input.equals(reversed);
        String lengthCategory = (input.length() % 2 == 0) ? "Even Length" : "Odd Length";

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + (isPalindrome ? "Yes" : "No"));
        System.out.println("Length Category: " + lengthCategory);
        sc.close();
    }
}
