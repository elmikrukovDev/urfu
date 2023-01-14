package lr1;

import Instrumens.StringHandler;

import java.time.LocalDateTime;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ex6 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        var scan = new Scanner(in);

        out.println("Лаб. №1, задание №5");

        out.println("Введите ваше имя: ");
        var userName = new StringBuilder(scan.nextLine());
        StringHandler.toUpperFirstChar(userName);
        out.println("Введите год вашего рождения: ");
        int yearOfBirthday;
        try {
            yearOfBirthday = scan.nextInt();
        } catch (java.util.InputMismatchException e) {
            out.println("Введенное значение не является числом!");
            return;
        }
        int userAge = LocalDateTime.now().getYear() - yearOfBirthday;
        out.printf("%s, ваш возраст: %d", userName, userAge);
    }
}
