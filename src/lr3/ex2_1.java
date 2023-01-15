package lr3;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex2_1 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №3 Задание 2");
        out.print("Введите название дня недели: ");
        String dayOfWeek = scan.nextLine();
        int numberDayOfWeek;
        switch (dayOfWeek.toLowerCase(Locale.ROOT))
        {
            case "понедельник":
                numberDayOfWeek = 1;
                break;
            case "вторник":
                numberDayOfWeek = 2;
                break;
            case "среда":
                numberDayOfWeek = 3;
                break;
            case "четверг":
                numberDayOfWeek = 4;
                break;
            case "пятница":
                numberDayOfWeek = 5;
                break;
            case "суббота":
                numberDayOfWeek = 6;
                break;
            case "воскресенье":
                numberDayOfWeek = 7;
                break;
            default:
                numberDayOfWeek = 0;
        }
        if (numberDayOfWeek == 0)
            out.println("Введенное слово не является название дня недели");
        else
            out.printf("\"%s\" - %d-й день недели", dayOfWeek, numberDayOfWeek);
    }
}
