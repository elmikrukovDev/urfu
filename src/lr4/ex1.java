package lr4;

import static java.lang.System.out;

public class ex1 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №4 Задание 1");
        final int height = 11;
        final int width = 23;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++)
                out.print(i == 0 || i == height - 1 || j == 0 || j == width - 1 ? "*" : " ");
            out.println();
        }
    }
}
