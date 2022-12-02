package lr1;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Start();
    }

    static void Start() {
        var scan = new Scanner(in);

        out.println("Лаб. №1, задание №2");

        out.print("Введите имя: ");
        String userName = scan.nextLine();
        out.print("Введите возраст: ");
        int userAge = scan.nextInt();

        out.printf("Вас зовут %s, вам %d лет.", userName, userAge);
    }
}
