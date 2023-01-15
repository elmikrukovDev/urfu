package lr3;

import java.util.Random;

import static java.lang.System.out;

public class ex10 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        out.println("Лабораторная работа №3 Задание 9");
        final int arrlength = 10;
        var numbers = new int[arrlength];
        var random = new Random();
        for (int i = 0; i < arrlength; i++)
            numbers[i] = random.nextInt(100);
        sort(numbers);
        for (int item: numbers)
            out.printf("%d ", item);
    }

    private static void sort(int[] arr) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] > arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
