package org.example;

class BinDec {

    // Method to validate the input and ensure it contains only 0s and 1s
    public static boolean isValidBinary(String binary) {
        // Check if the input matches the binary format (0s and 1s only)
        return binary.matches("[01]+");
    }

    // Method to convert a binary string to decimal
    public static int binaryToDecimal(String binary) {
        // Convert the binary string to a decimal using a mathematical approach
        int decimal = 0;
        int length = binary.length();

        // Iterate over each binary digit
        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(i);
            // Calculate the decimal value using Math.pow and adjust by index
            if (bit == '1') {
                decimal += Math.pow(2, length - 1 - i);
            }
        }
        return decimal;
    }
}
