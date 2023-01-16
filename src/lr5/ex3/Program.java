package lr5.ex3;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №5 Задание 3");
        var iw1 = new IntWorker();
        var iw2 = new IntWorker(1);
        var iw3 = new IntWorker(1, 2);
    }
}
