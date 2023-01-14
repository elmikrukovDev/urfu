package lr1;

import static java.lang.System.in;
import static java.lang.System.out;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        var scan = new Scanner(in);

        out.println("Лаб. №1, задание №7");

        out.println("Введите ваш возраст: ");
        int userAge;
        try {
            userAge = scan.nextInt();
        } catch (java.util.InputMismatchException e) {
            out.println("Введенное значение не является числом!");
            return;
        }
        int yearOfBirthday = LocalDateTime.now().getYear() - userAge;
        out.printf("Ваш год рождения: %d", yearOfBirthday);
    }
}
