package ConvertDecimal_2_4;
/*
Objectives
Your program should output the prompt Do you want to convert /from decimal or /to decimal? (To quit type /exit) to prompt the user for their next move. The possible commands are /from, /to, and /exit.

If the user types /from, the program should behave as in the previous stage and convert the user's number from the decimal system to binary, octal, or hexadecimal.
If the user types /to, the program should:
Print the prompt Enter source number: and read the user input number to be converted to decimal.
Print the prompt Enter source base: and read the target base (2, 8, or 16).
Output the message Conversion to decimal result: followed by the number's representation in the decimal system.
If the user types /exit, the program stops. Otherwise, it should process the command and prompt for the next one.
 */
import java.util.Scanner;

public class ConvertDecimal_2_4 {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        String inputString;
        String inputStringTo;
        int inputNumber;
        int targetBase;
        int targetBaseTo;



        do {
            System.out.println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)");
            inputString = scanner.nextLine();

            if (inputString.equals("/from")) {
                System.out.println("Enter a number in decimal system: ");
                inputNumber = scanner.nextInt();
                System.out.println("Enter the target base:");
                targetBase = scanner.nextInt();
                if (targetBase == 2) {
                    System.out.println("Conversion result: " + Integer.toBinaryString(inputNumber));
                } else if (targetBase == 16) {
                    System.out.println("Conversion result: " + Integer.toHexString(inputNumber));
                } else if (targetBase == 8) {
                    System.out.println("Conversion result: " + Integer.toOctalString(inputNumber));
                }
            } else if (inputString.equals("/to")) {
                System.out.println("Enter source number: ");
                inputStringTo = scanner.nextLine();
                System.out.println("Enter source base:");
                targetBaseTo = scanner.nextInt();

                if (targetBaseTo == 16) {
                    System.out.println("Conversion to decimal result: " + Integer.parseInt(inputStringTo,16));
                } else if (targetBaseTo == 8) {
                    System.out.println("Conversion to decimal result: " + Integer.parseInt(inputStringTo,8));
                } else if (targetBaseTo == 2) {
                    System.out.println("Conversion to decimal result: " + Integer.parseInt(inputStringTo,2));
                }

            }
        } while (!inputString.equals("/exit"));

    }

}

