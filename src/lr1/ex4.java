package lr1;

import Instrumens.StringHandler;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        var scan = new Scanner(in);

        out.println("Лаб. №1, задание №4");

        out.print("Введите название месяца: ");
        var monthName = new StringBuilder(scan.nextLine());
        StringHandler.toUpperFirstChar(monthName);
        out.print("Введите количество дней в этом месяце: ");
        int numberOfDays;
        try {
            numberOfDays = scan.nextInt();
        } catch (java.util.InputMismatchException e) {
            out.println("Введенное значение не является числом!");
            return;
        }
        out.printf("В %s %d день.", monthName, numberOfDays);
    }
}
