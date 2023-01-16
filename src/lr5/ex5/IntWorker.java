package lr5.ex5;

public class IntWorker {
    private int int1;
    public IntWorker() {
        setInt();
    }
    public IntWorker(int val) {
        setInt(val);
    }
    public void setInt() {
        int1 = 0;
    }
    public void setInt(int val) {
        int1 = chekParam(val);
    }

    private int chekParam(int val) {
        if (val > 100) return 100;
        return val;
    }
}
