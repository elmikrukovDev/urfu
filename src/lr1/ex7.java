package lr1;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        var scan = new Scanner(in);

        out.println("Лаб. №1, задание №8");

        double firstSummand, secondSummand;
        try {
            out.println("Введите 1-е слагаемое: ");
            firstSummand = scan.nextDouble();
            out.println("Введите 2-е слагаемое: ");
            secondSummand = scan.nextDouble();
        } catch (java.util.InputMismatchException e) {
            out.println("Введенное значение не является числом!");
            return;
        }
        double result = firstSummand + secondSummand;
        out.printf("Результат: %f", result);
    }
}
