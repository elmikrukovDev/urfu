package lr6.ex2;

import static java.lang.System.out;

public class IntStaticWorker {
    private static int int1 = 0;

    public static void print() {
        out.printf("int1 - %d\n", int1++);
    }
}
