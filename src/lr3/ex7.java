package lr3;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex7 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №3 Задание 7");
        out.print("Введите количество чисел в массиве: ");
        final int arrlength = 30;
        final byte letterCodeUTFA = 97;
        final byte letterCodeUTFZ = 122;
        final byte step = 2;
        var arr = new char[arrlength];
        byte currentLetterCode = letterCodeUTFA;
        for (int i = 0; i < arrlength && currentLetterCode + step < letterCodeUTFZ; i++) {
            arr[i] = (char)(currentLetterCode += step);
        }
        out.print("Array - ");
        for (char item: arr)
            if (item != 0)
                out.print(item + " ");
    }
}
