package lr6.ex2;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №6 Задание 2");
        for (int i = 0; i < 100; i++)
            IntStaticWorker.print();
    }
}
