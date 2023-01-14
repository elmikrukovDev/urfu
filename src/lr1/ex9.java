package lr1;

        import static java.lang.System.in;
        import static java.lang.System.out;

        import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        var scan = new Scanner(in);

        out.println("Лаб. №1, задание №9");

        double number;
        try {
            out.print("Введите число: ");
            number = scan.nextDouble();
        } catch (java.util.InputMismatchException e) {
            out.println("Введенное значение не является числом!");
            return;
        }
        double numberFirst = number - 1,
               numberSecond = number,
               numberThird = number + 1,
               numberFourth = Math.pow(numberFirst + numberSecond + numberThird, 2);

        out.println("Результат:");
        out.printf("%f; ", numberFirst);
        out.printf("%f; ", numberSecond);
        out.printf("%f; ", numberThird);
        out.printf("%f; ", numberFourth);
    }
}

