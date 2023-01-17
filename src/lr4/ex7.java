package lr4;

import java.util.SplittableRandom;

import static java.lang.System.out;

public class ex7 {
    private interface IteratorOperation {
        public int calc(int iter);
    }

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        var r = new SplittableRandom();
        out.println("Лабораторная работа №4 Задание 7");
        final int h = 5, w = 5;
        int[][] arr = new int[h][w];
        for (int i = 0; i < h; i++) {
            if (i % 2 == 0)
                for (int j = 0; j < w; j++)
                    arr[i][j] = r.nextInt(0, 100);
            else
                for (int j = w - 1; j >= 0; j--)
                    arr[i][j] = r.nextInt(0, 100);
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
                out.print(arr[i][j] + "\t");
            out.println();
        }
    }
}
