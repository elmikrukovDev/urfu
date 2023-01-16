package lr6.ex3;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №6 Задание 3");
        var vals = new int[] { 40, -40, 0 };
        var min = IntStaticWorker.getMin(vals);
        var max = IntStaticWorker.getMax(vals);
        var mid = IntStaticWorker.getMiddle(vals);
        out.printf("Min - %d, Middle - %d, Max - %d", min, mid, max);
    }
}
