package lr3;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex5 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №3 Задание 5");
        out.print("Введите количество чисел в сумме: ");
        int count = scan.nextInt();
        int currentCount = 0;
        int number = 0;
        int result = 0;
        out.print("При сложении чисел: ");
        while (currentCount != count) {
            if (number % 5 == 2 && number % 3 == 1) {
                out.printf("%d ", number);
                result += number;
                currentCount++;
            }
            number++;
        }
        out.print("\nРезультат: " + result);
    }
}
