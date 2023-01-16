package lr5.ex6;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №5 Задание 5");
        var x = new IntWorker(-2, -1);
        x.print();
        x.setValue(10, -10);
        x.print();
    }
}
