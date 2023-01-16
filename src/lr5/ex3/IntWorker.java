package lr5.ex3;

import static java.lang.System.out;

public class IntWorker {
    private int int1;
    private int int2;

    public IntWorker() {

    }

    public IntWorker(int val1) {
        this();
        int1 = val1;
    }

    public  IntWorker(int val1, int val2) {
        this(val1);
        int2 = val2;
    }
}
