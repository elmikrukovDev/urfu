package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class task3 {
    public static void main(String[] args) {
        try {
            var scan = new Scanner(in);
            out.print("Введите колличество элементов: ");
            int count = scan.nextInt();
            byte[] arr = new byte[count];
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextByte();
                result = Math.addExact(result, arr[i]);
            }
            out.printf("Сумма: %d", result);
        } catch (InputMismatchException e) {
            out.printf("Возникла ошибка ввода, %s", e.getMessage());
        } catch (Exception e) {
            out.println("Возникла ошибка: " + e.getMessage());
        }
    }
}
