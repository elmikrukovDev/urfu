package lr6.ex6;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №6 Задание 6");
        var sub = IntStaticWorker.subArray(new int[] { 1, 2, 3, 4, 5, 6 }, 30);
        for (int item: sub)
            out.printf("%d ", item);
    }
}
