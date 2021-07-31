package ConvertDecimal_3_4;

import java.math.BigInteger;
import java.util.Scanner;

public class ConvertDecimal_3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit)");
            String a = scanner.next();
            if (a.equals("/exit")) {
                break;
            }
            String b = scanner.next();
            int sourceBase = Integer.parseInt(a);
            int targetBase = Integer.parseInt(b);

            while (true) {
                System.out.printf("Enter number in base %s to convert to base %s (To go back type /back)\n", sourceBase, targetBase);
                String number = scanner.next();
                if (number.equals("/back")) {
                    System.out.println();
                    break;
                } else {
                    String decimalNumber = new BigInteger(number, sourceBase).toString();
                    String result = new BigInteger(decimalNumber).toString(targetBase);
                    System.out.println("Conversion result: " + result);
                    System.out.println();
                }
            }

        }
    }
}
