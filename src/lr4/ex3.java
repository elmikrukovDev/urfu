package lr4;

import static java.lang.System.out;

public class ex3 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №4 Задание 3");
        final int h = 6;
        final int w = 5;
        char[][] rec = new char[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
                rec[i][j] = i == 0 || i == h - 1 || j == 0 || j == w - 1 ? '2' : ' ';
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
                out.print(rec[i][j]);
            out.println();
        }
    }
}
