package lr3;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex6 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №3 Задание 6");
        out.print("Введите количество чисел в массиве: ");
        int count = 0;
        try {
            count = scan.nextInt();
        } catch (InputMismatchException e) {
            out.print("Произведен не корректный ввод: " + e);
            return;
        }
        var array = new int[count];
        int currentCount = 0, number = 0;
        while (currentCount != count) {
            if (number % 5 == 2) {
                array[currentCount] = number;
                currentCount++;
            }
            number++;
        }
        out.print("Массив: ");
        for (int item: array)
            out.printf("%d ", item);
    }
}
