package lr1;

import static java.lang.System.in;
import static java.lang.System.out;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        var scan = new Scanner(in);

        out.println("Лаб. №1, задание №5");

        out.println("Введите год вашего рождения: ");
        int yearOfBirthday;
        try {
            yearOfBirthday = scan.nextInt();
        } catch (java.util.InputMismatchException e) {
            out.println("Введенное значение не является числом!");
            return;
        }
        int userAge = LocalDateTime.now().getYear() - yearOfBirthday;
        out.printf("Ваш возраст: %d", userAge);
    }
}
