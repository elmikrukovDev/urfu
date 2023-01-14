package lr1;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        start();
    }
    static void start() {
        var scan = new Scanner(in);

        out.println("Лаб. №1, задание №1");

        out.print("Введите фамилию: ");
        var firstName = scan.nextLine();

        out.print("Введите имя: ");
        var lastName = scan.nextLine();

        out.print("Введите отчество: ");
        var middleName = scan.nextLine();

        out.printf("Hello: \"%s %s %s\"", firstName, lastName, middleName);
    }
}
