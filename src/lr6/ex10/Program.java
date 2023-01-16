package lr6.ex10;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №6 Задание 10");
        var minMax = StaticWorker.findMinMax(1, 40, 2, -1, 2, 5);
        out.printf("min - %d, max - %d", minMax[0], minMax[1]);
    }
}
