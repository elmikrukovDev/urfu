package lr2;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex4 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №2 Задание 4");
        out.print("Введите число: ");
        int number = scan.nextInt();
        if (number >= 5 && number <= 10)
            out.printf("Число \"%d\" удовлятворяет критериям", number);
        else
            out.printf("Число \"%d\" не удовлятворяет критериям", number);
    }
}
