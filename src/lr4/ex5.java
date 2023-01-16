package lr4;

import java.util.SplittableRandom;

import static java.lang.System.out;

public class ex5 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var r = new SplittableRandom();
        out.println("Лабораторная работа №4 Задание 5");
        final int h = 3;
        final int w = 5;
        int[][] arr = new int[h][w];
        int[][] arrTrans = new int[w][h];
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
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++)
                arrTrans[i][j] = arr[j][i];
        }
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++)
                out.print(arrTrans[i][j] + "\t");
            out.println();
        }
    }
}
