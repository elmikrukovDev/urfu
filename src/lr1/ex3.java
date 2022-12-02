package lr1;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        var scan = new Scanner(in);

        out.print("Введите название текущего дня недели: ");
        var weekName = new StringBuilder(scan.next());
        toUpperFirstChar(weekName);
        out.print("Введите название текущего месяца: ");
        var monthName = new StringBuilder(scan.next());
        toUpperFirstChar(monthName);
        out.print("Введите номер текущего дня в месяце: ");
        var dayNumber = scan.nextInt();

        out.printf("Сегодня %s, %d %s", weekName, dayNumber, monthName);
    }

    static void toUpperFirstChar(StringBuilder sb) {
        final int CHAR_INDEX = 0;
        var changingChar = String.valueOf(sb.charAt(CHAR_INDEX));
        sb.replace(CHAR_INDEX, CHAR_INDEX + 1, changingChar.toUpperCase());
    }
}
