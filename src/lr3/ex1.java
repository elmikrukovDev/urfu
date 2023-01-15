package lr3;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex1 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №3 Задание 1");
        out.print("Введите число от 1 до 7: ");
        int number = scan.nextInt();
        String dayOfWeek;
        switch (number)
        {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = null;
        }
        if (dayOfWeek == null)
            out.println("Введенное число выходит за диапазон 1-7");
        else
            out.printf("День с номером \"%d\" - \"%s\"", number, dayOfWeek);
    }
}
