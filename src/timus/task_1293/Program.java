package timus.task_1293;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        var scan = new Scanner(in);

        out.println("Timus №1293");

        final int countMaterial = 1;
        int number, width, height;
        try {
            number = scan.nextInt();
            width = scan.nextInt();
            height = scan.nextInt();
        } catch (java.util.InputMismatchException e) {
            out.println("Введенное значение не является числом!");
            return;
        }
        int result = 2 * number * width * height * countMaterial;

        out.printf("Результат: %d", result);
    }
}
