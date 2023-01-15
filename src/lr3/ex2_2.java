package lr3;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex2_2 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №3 Задание 2");
        out.print("Введите название дня недели: ");
        String dayOfWeek = scan.nextLine();
        int numberDayOfWeek = 0;
        if (dayOfWeek.toLowerCase(Locale.ROOT) == "понедельник")
            numberDayOfWeek = 1;
        else if (dayOfWeek.toLowerCase(Locale.ROOT) == "вторник")
            numberDayOfWeek = 2;
        else if (dayOfWeek.toLowerCase(Locale.ROOT) == "среда")
            numberDayOfWeek = 3;
        else if (dayOfWeek.toLowerCase(Locale.ROOT) == "четверг")
            numberDayOfWeek = 4;
        else if (dayOfWeek.toLowerCase(Locale.ROOT) == "пятница")
            numberDayOfWeek = 5;
        else if (dayOfWeek.toLowerCase(Locale.ROOT) == "суббота")
            numberDayOfWeek = 6;
        else if (dayOfWeek.toLowerCase(Locale.ROOT) == "воскресенье")
            numberDayOfWeek = 7;
        else {
            out.println("Введенное слово не является названием дня недели");
            return;
        }
        out.printf("\"%s\" - %d-й день недели", dayOfWeek, numberDayOfWeek);
    }
}
