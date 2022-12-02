package lr1;

import java.util.Scanner;

public class ex1 {
    public static void Start() {
        var in = new Scanner(System.in);
        var out = System.out;

        out.println("Лаб. №1, задание №1");

        out.print("Введите фамилию: ");
        var firstName = in.nextLine();

        out.print("Введите имя: ");
        var lastName = in.nextLine();

        out.print("Введите отчество: ");
        var middleName = in.nextLine();

        out.printf("Hello: \"%s %s %s\"", firstName, lastName, middleName);
    }
}
