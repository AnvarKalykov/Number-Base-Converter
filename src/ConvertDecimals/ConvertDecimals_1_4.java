/*
Objectives
Your program's output should consist of the following three lines:

On the first line, the prompt Enter number in decimal system: is shown, and the user inputs a decimal number to be converted.
On the second one, the prompt Enter target base: is printed, and the user enters the target base (2, 8, or 16).
On the third one, the message Conversion result: is printed, followed by the correct number representation in the given base.
Example
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1:

Enter number in decimal system: > 8
Enter target base: > 16
Conversion result: 8
Example 2:

Enter number in decimal system: > 101
Enter target base: > 2
Conversion result: 1100101
Example 3:

Enter number in decimal system: > 103
Enter target base: > 8
Conversion result: 147
 */


package ConvertDecimals;

import java.util.Scanner;

public class ConvertDecimals_1_4 {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in decimal system: ");
        int inputNumber = scanner.nextInt();
        System.out.println("Enter target base:");
        int targetBase = scanner.nextInt();


        if (targetBase == 2) {
            System.out.println("Conversion result: " + Integer.toBinaryString(inputNumber));
        } else if (targetBase == 16) {
            System.out.println("Conversion result: " + Integer.toHexString(inputNumber));
        } else if (targetBase == 8) {
            System.out.println("Conversion result: " + Integer.toOctalString(inputNumber));
        } else {
            System.out.println("Please enter 16, 8 or 2");
        }


    }


}
