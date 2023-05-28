package lr13;

import static java.lang.System.out;

public class ex4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new Thread(() -> {
                out.printf("Thread number: %d\n", Thread.currentThread().getId());
            }).start();
    }
}
