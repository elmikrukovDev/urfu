package lr2;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex5 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №2 Задание 5");
        out.print("Введите число: ");
        int number = scan.nextInt();
        out.printf("В числе \"%d\" - \"%d\" тысяч(а)", number, number / 1000);
    }
}
