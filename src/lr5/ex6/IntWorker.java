package lr5.ex6;

import static java.lang.System.out;

public class IntWorker {
    private int min;
    private int max;
    public IntWorker(int val1) {
        setValue(val1);
    }
    public IntWorker(int val1, int val2) {
        setValue(val1, val2);
    }
    public void setValue(int val1) {
        if (min > val1) min = val1;
        if (max < val1) max = val1;
    }
    public void setValue(int val1, int val2) {
        setValue(val1);
        if (min > val2) min = val2;
        if (max < val2) max = val2;
    }
    public void print() {
        out.printf("min - %d, max - %d\n", min, max);
    }
}
