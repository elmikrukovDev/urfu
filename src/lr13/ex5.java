package lr13;

import java.util.Random;

import static java.lang.System.out;

public class ex5 {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        var rnd = new Random();
        final int count = 10000;
        int[] arr = new int[count];
        for (int i = 0; i < count; i++)
            arr[i] = rnd.nextInt(count);

        var cores = Runtime.getRuntime().availableProcessors();
        out.printf("Count cores - %d\n", cores);
        int countOneThread = count / cores;
        var obj = new Object() { int max = 0; };
        for (int i = 0; i < cores; i++) {
            final int coresIterator = i;
            new Thread(() -> {
                for (int j = coresIterator * countOneThread; j < (coresIterator + 1) * countOneThread; j++) {
                    synchronized (lock) {
                        if (obj.max < arr[j]) obj.max = arr[j];
                    }
                }
            }).start();
        }
        out.println(obj.max);
    }
}
