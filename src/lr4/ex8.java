package lr4;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class ex8 {
    public static void main(String[] args) {
        try {
            start();
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }

    private static void start() {
        var scan = new Scanner(in);
        out.println("Лабораторная работа №4 Задание 7");
        out.print("Введите текст, который необходимо защифровать: ");
        String text = scan.nextLine();
        int key = getKey(scan);
        out.print("Зашифрованный текст: ");
        var cryptText = encrypt(text, key);
        out.printf("%s\n", cryptText);
        scan.nextLine();
        while (true) {
            out.print("Хотите выполнить обратное преобразование? (y, n): ");
            var answer = scan.nextLine();
            switch (answer) {
                case "y":
                case "Y":
                    cryptText = decrypt(cryptText.toString(), key);
                    out.printf("%s\n", cryptText);
                    break;
                case "n":
                case "N":
                    out.println("До свидания!");
                    break;
                default:
                    out.println("Введите корректный ответ");
                    continue;
            }
            break;
        }
    }

    private static int getKey(Scanner scan) {
        while (true) {
            out.print("Введите ключ шифрования (целое число): ");
            try {
                return scan.nextInt();
            } catch (Exception e) { }
        }
    }

    private static StringBuilder encrypt(String text, int key) throws IllegalArgumentException {
        char[] upperRangeRU = { 'А', 'Я' };
        char[] lowerRangeRU = { 'а', 'я' };
        char[] upperRangeEN = { 'A', 'Z' };
        char[] lowerRangeEN = { 'a', 'z' };

        var encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            var l = text.charAt(i);
            if (containsRange(upperRangeEN, l))
                encryptedText.append(encryptChar(upperRangeEN, l, key));
            else if (containsRange(lowerRangeEN, l))
                encryptedText.append(encryptChar(lowerRangeEN, l, key));
            else if (containsRange(upperRangeRU, l))
                encryptedText.append(encryptChar(upperRangeRU, l, key));
            else if (containsRange(lowerRangeRU, l))
                encryptedText.append(encryptChar(lowerRangeRU, l, key));
            else if (l == ' ' || l == ',' || l == '.' || l == '-')
                encryptedText.append(l);
            else
                throw new IllegalArgumentException(String.format("Обнаружен символ \"%s\" вне диапазона", l));
        }
        return encryptedText;
    }

    private static StringBuilder decrypt(String text, int key) throws IllegalArgumentException {
        char[] upperRangeRU = { 'А', 'Я' };
        char[] lowerRangeRU = { 'а', 'я' };
        char[] upperRangeEN = { 'A', 'Z' };
        char[] lowerRangeEN = { 'a', 'z' };

        var decryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            var l = text.charAt(i);
            if (containsRange(upperRangeEN, l))
                decryptedText.append(decryptChar(upperRangeEN, l, key));
            else if (containsRange(lowerRangeEN, l))
                decryptedText.append(decryptChar(lowerRangeEN, l, key));
            else if (containsRange(upperRangeRU, l))
                decryptedText.append(decryptChar(upperRangeRU, l, key));
            else if (containsRange(lowerRangeRU, l))
                decryptedText.append(decryptChar(lowerRangeRU, l, key));
            else if (l == ' ' || l == ',' || l == '.' || l == '-')
                decryptedText.append(l);
            else
                throw new IllegalArgumentException(String.format("Обнаружен символ \"%s\" вне диапазона", l));
        }
        return decryptedText;
    }

    private static char encryptChar(char[] range, char letter, int key) {
        checkRange(range);
        while (key > 0) {
            if (letter == range[1]) letter = range[0];
            else letter += 1;
            key--;
        }
        return letter;
    }

    private static char decryptChar(char[] range, char letter, int key) {
        checkRange(range);
        while (key > 0) {
            if (letter == range[0]) letter = range[1];
            else letter -= 1;
            key--;
        }
        return letter;
    }

    private static boolean containsRange(char[] range, char letter) {
        checkRange(range);
        return range[0] <= letter && range[1] >= letter || range[1] <= letter && range[0] >= letter;
    }

    private static void checkRange(char[] range) throws IllegalArgumentException {
        if (range.length != 2) throw new IllegalArgumentException("Задан неверный диапазон");
    }
}
