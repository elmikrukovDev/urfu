package lr6.ex7;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №6 Задание 7");
        var sub = StaticWorker.charsToCodes(new char[] { 'a', 'b', 'b' });
        for (int item: sub)
            out.printf("%d ", item);
    }
}
