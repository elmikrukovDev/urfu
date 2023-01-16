package lr6.ex8;

public class StaticWorker {
    public static double getMiddle(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++)
            res += arr[i];
        return (double)res / (double)arr.length;
    }
}
