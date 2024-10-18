package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Binary is the number system all digital computers are based on.");
        System.out.println("Please enter up to 8 binary digits (0s and 1s only):");

        // Get user input
        String input = scanner.nextLine();

        // Check if the input is valid
        if (input.length() <= 8 && BinDec.isValidBinary(input)) {
            // Convert the binary to decimal and display the result
            int decimal = BinDec.binaryToDecimal(input);
            System.out.println("Decimal equivalent: " + decimal);
        } else {
            // Notify the user if the input is invalid
            System.out.println("Invalid input! Please enter a string of up to 8 binary digits (0s and 1s only).");
        }

        scanner.close();
    }
}




