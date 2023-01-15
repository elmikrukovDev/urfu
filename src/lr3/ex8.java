package lr3;

import static java.lang.System.out;

public class ex8 {
    private static final char[] vowels = new char[] { 'A', 'E', 'I', 'O', 'U', 'Y' };

    public static void main(String[] args) {
        start();
    }

    private static void start() {

        out.println("Лабораторная работа №3 Задание 8");
        final int arrlength = 10;
        final char a = 'A', z = 'Z';
        var arr = new char[arrlength];
        char currentLetter = a;
        for (int i = 0; i < arrlength && currentLetter < z; currentLetter++)
            if (!isVowel(currentLetter))
                arr[i++] = currentLetter;
        out.print("Array - ");
        for (char item: arr)
            if (item != 0)
                out.print(item + " ");
    }

    private static boolean isVowel(char character) {
        for (char item: vowels)
            if (character == item)
                return true;
        return false;
    }
}
