package lr11;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ex2 {
    public static void main(String[] args) {
        var scan = new Scanner(in);
        out.print("Press type number to convert binary: ");
        var number = scan.nextInt();
        out.printf("Binary: %s", toBinary(number));
    }

    public static String toBinary(int number) {
        return number == 0 ? "" : toBinary(number / 2) + number % 2;
    }
}
