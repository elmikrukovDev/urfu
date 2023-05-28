package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class task2 {
    public static void main(String[] args) {
        int [][] arr = {
            { 1, 2, 3 },
            { 1, 2, 3 },
            { 1, 2, 3 }
        };
        try {
            var scan = new Scanner(in);
            out.print("Введите номер столбца (нумерация с нуля): ");
            int column = scan.nextInt();
            if (column > 3 || column < 0)
                throw new InputMismatchException("Не существует введенного номера столбца");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (column == j)
                        out.printf("%d\n", arr[i][j]);
                }
            }
        } catch (InputMismatchException e) {
            var mes = e.getMessage();
            out.printf("Ошибка ввода %s", mes == null ? "" : mes);
        }
    }
}
