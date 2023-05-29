package lr10;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class task1 {
    public static void main(String[] args) {
        try {
            var scan = new Scanner(in);
            while (true) {
                out.print("Библиотека:\n" +
                        "1. Добавить книгу;\n" +
                        "2. Найти книгу;\n" +
                        "3. Удалить книгу.\n" +
                        "4. Вывести все кнгиги.\n" +
                        "Введите номер операции: ");
                var operation = scan.nextInt();
                switch (operation) {
                    case 1:
                        out.print("Введите название книги: ");
                        var name = scan.next();
                        out.print("Введите автора книги: ");
                        var author = scan.next();
                        Library.addBook("src/lr10/lib.xml", new Book(name, author));
                        break;
                    case 2:
                        out.print("Введите автора книги: ");
                        Library.findBooksByAuthor("src/lr10/lib.xml", scan.next());
                        break;
                    case 3:
                        out.print("Введите название книги: ");
                        Library.delBook("src/lr10/lib.xml", scan.next());
                        break;
                    case 4:
                        Library.printBooks("src/lr10/lib.xml");
                        break;
                    default:
                        out.println("[ERROR] - введен не верный код операции!");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
