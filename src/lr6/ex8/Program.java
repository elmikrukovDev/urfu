package lr6.ex8;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №6 Задание 8");
        var mid = StaticWorker.getMiddle(new int[] { 1, 2, 3, 4, 5, 6 });
        out.print(mid);
    }
}
