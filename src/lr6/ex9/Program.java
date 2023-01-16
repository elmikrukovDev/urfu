package lr6.ex9;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №6 Задание 9");
        var arr = new char[] { 'a', 'b', 'с', 'd' };
        for (char item: arr)
            out.printf("%s ", item);
        out.println();
        var sorted = StaticWorker.pairwiseReplase(arr);
        for (char item: sorted)
            out.printf("%s ", item);
    }
}
