package lr6.ex1;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №6 Задание 1");
        var x0 = new StringCharWorker();
        x0.setValue('c');
        x0.print();
        var x1 = new StringCharWorker();
        x1.setValue("dsad");
        x1.print();
        var x2 = new StringCharWorker();
        x2.setValue(new char[] { 'h', 'e', 'l', 'l', 'o' });
        x2.print();
    }
}
