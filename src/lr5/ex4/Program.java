package lr5.ex4;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №5 Задание 4");
        var ciw = new CharIntWorker(65.214);
        out.print(ciw);
    }
}
