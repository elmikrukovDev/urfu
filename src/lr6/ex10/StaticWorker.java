package lr6.ex10;

public class StaticWorker {
    public static int[] findMinMax(int ...vals) {
        var minMax = new int[2];
        for (int item: vals) {
            if (minMax[0] > item) minMax[0] = item;
            if (minMax[1] < item) minMax[1] = item;
        }
        return minMax;
    }
}
