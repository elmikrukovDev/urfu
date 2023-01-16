package lr6.ex4;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №6 Задание 4");
        int x1 = IntStaticWorker.calcDoubleFactorialWithoutRecursion(5);
        int x2 = IntStaticWorker.calcDoubleFactorialWithRecursion(5);
        out.print(x1 + " " + x2);
    }
}
