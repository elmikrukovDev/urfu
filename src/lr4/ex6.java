package lr4;

import java.util.SplittableRandom;

import static java.lang.System.out;

public class ex6 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var r = new SplittableRandom();
        out.println("Лабораторная работа №4 Задание 6");
        final int h = 5;
        final int w = 5;
        int[][] arr = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
                arr[i][j] = r.nextInt(0, 100);
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
                out.print(arr[i][j] + "\t");
            out.println();
        }
        out.println();
        int[][] arrNew = new int[h - 1][w - 1];
        int deletingH = r.nextInt(0, h),
            deletingW = r.nextInt(0, w);
        for (int i = 0; i < h; i++) {
            if (i != deletingH) {
                for (int j = 0; j < w; j++)
                    if (j != deletingW)
                        arrNew[i < deletingH ? i : i - 1][j < deletingW ? j : j - 1] = arr[i][j];
            }
        }
        for (int i = 0; i < h - 1; i++) {
            for (int j = 0; j < w - 1; j++)
                out.print(arrNew[i][j] + "\t");
            out.println();
        }
    }
}
