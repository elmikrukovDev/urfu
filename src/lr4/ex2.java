package lr4;

import static java.lang.System.out;

public class ex2 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №4 Задание 2");
        final int height = 5;
        final int width = 5;
        int rel = height > width ? height / width : width / height;
        int hupotenuse = width;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++)
                out.print(i == 1 || j == 1 || j == hupotenuse - rel ? "*" : " ");
            if (i != 1)
                hupotenuse -= rel;
            out.println();
        }
    }
}
