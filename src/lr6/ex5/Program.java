package lr6.ex5;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №6 Задание 5");
        int x1 = IntStaticWorker.calcSumOfSquaresOfNumbersWithRecursion(4);
        int x2 = IntStaticWorker.calcSumOfSquaresOfNumbersWithoutRecursion(4);
        out.print(x1 + " " + x2);
    }
}
