package lr4;

import static java.lang.System.out;

public class ex4 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №4 Задание 2");
        final int h = 5;
        final int w = 5;
        char[][] triangle = new char[h][w];
        int rel = h > w ? h / w : w / h;
        int hupotenuse = w;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++)
                triangle[i - 1][j - 1] = i == 1 || j == 1 || j == hupotenuse - rel ? '*' : ' ';
            if (i != 1)
                hupotenuse -= rel;
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
                out.print(triangle[i][j]);
            out.println();
        }
    }
}
