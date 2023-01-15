package lr3;

import java.util.Random;

import static java.lang.System.out;

public class ex9 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №3 Задание 9");
        final int arrlength = 10;
        var numbers = new int[arrlength];
        var random = new Random();
        for (int i = 0; i < arrlength; i++)
            numbers[i] = random.nextInt(100);
        int min = numbers[0];
        for (int i = 0; i < arrlength; i++)
            if (min > numbers[i])
                min = numbers[i];
        for (int i = 0; i < arrlength; i++)
            if (numbers[i] == min)
                out.printf("Index %d - %d\n", i, numbers[i]);
    }
}
