package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class task1 {
    public static void main(String[] args) {
        try {
            var scan = new Scanner(in);
            out.print("Введите колличество элементов: ");
            int count = scan.nextInt();
            int[] arr = new int[count];
            for (int i = 0; i < arr.length; i++)
                arr[i] = scan.nextInt();
            int countPositive = 0,
                    result = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    result += arr[i];
                    countPositive++;
                }
            }
            if (countPositive == 0) throw new Exception("arr don't have positive numbers");
            out.printf("Среднее значение равно: %d", result / countPositive);
        } catch (InputMismatchException e) {
            out.println("Возникла ошибка ввода");
        } catch (Exception e) {
            out.println("Возникла ошибка: " + e.getMessage());
        }
    }
}
