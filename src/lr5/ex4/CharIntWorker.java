package lr5.ex4;

public class CharIntWorker {
    private int int1;
    private char char1;

    public CharIntWorker(double val1) {
        this((char)((val1 - Math.floor(val1)) * 100), (char)Math.floor(val1));
    }

    private CharIntWorker(int val1) {
        int1 = val1;
    }

    public CharIntWorker(int val1, char val2) {
        this(val1);
        char1 = val2;
    }

    @Override
    public String toString() {
        return String.format("Int - %d; Char - %s", int1, char1);
    }
}
