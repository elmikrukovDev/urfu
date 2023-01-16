package lr5.ex2;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №5 Задание 2");
        var cw = new CharWorker();
        cw.setCharacter1('Z');
        cw.setCharacter2('A');
        cw.printRange();
    }
}
