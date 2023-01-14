package lr1;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        var scan = new Scanner(in);

        out.println("Лаб. №1, задание №10");

        double first, second;
        try {
            out.println("Введите 1-е число: ");
            first = scan.nextDouble();
            out.println("Введите 2-е число: ");
            second = scan.nextDouble();
        } catch (java.util.InputMismatchException e) {
            out.println("Введенное значение не является числом!");
            return;
        }
        out.printf("Результат суммы: %f + %f = %f;\n", first, second, first + second);
        out.printf("Результат разности: %f - %f = %f;", first, second, first - second);
    }
}
