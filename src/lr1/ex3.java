package lr1;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;
import Instrumens.StringHandler;

public class ex3 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        var scan = new Scanner(in);

        out.print("Введите название текущего дня недели: ");
        var weekName = new StringBuilder(scan.next());
        StringHandler.toUpperFirstChar(weekName);
        out.print("Введите название текущего месяца: ");
        var monthName = new StringBuilder(scan.next());
        StringHandler.toUpperFirstChar(monthName);
        out.print("Введите номер текущего дня в месяце: ");
        int dayNumber;
        try {
            dayNumber = scan.nextInt();
        } catch (InputMismatchException e) {
            out.println("Введенное значение не является числом!");
            return;
        }
        out.printf("Сегодня %s, %d %s", weekName, dayNumber, monthName);
    }
}
