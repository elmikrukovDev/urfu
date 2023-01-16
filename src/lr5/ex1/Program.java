package lr5.ex1;

import java.util.Random;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №5 Задание 1");
        var cw = new CharWorker();
        cw.setCharacter('A');
        out.println("Char code:" + cw.getCharCode());
        cw.print();
    }
}
