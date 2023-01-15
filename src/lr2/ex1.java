package lr2;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex1 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №2 Задание 1");
        out.print("Введите число: ");
        int number = scan.nextInt();
        if (number % 3 == 0)
            out.printf("Число \"%d\" делится на 3", number);
        else
            out.printf("Число \"%d\" не делится на 3", number);
    }
}
