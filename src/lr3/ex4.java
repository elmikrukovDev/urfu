package lr3;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex4 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №3 Задание 4");
        out.print("Введите введите 2 целых числа: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        if (number1 > number2) {
            int temp = number2;
            number2 = number1;
            number1 = temp;
        }
        out.printf("В диапазоне [%d; %d] находятся следующие целые числа: ", number1, number2);
        while (number1 <= number2)
            out.printf("%d ", number1++);
    }
}
