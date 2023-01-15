package lr3;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex3 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №3 Задание 3");
        out.print("Введите количество чисел в последовательности Фибоначчи: ");
        int number = scan.nextInt();
        int temp = 0, prev = 0, latest = 1;
        for (int i = 1; i <= number; i++) {
            latest += temp;
            temp = prev;
            prev = latest;
            out.printf("%d ", latest);
        }
    }
}
