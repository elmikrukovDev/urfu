package lr6.ex5;

public class IntStaticWorker {
    public static int calcSumOfSquaresOfNumbersWithRecursion(int n) {
        return n == 1 ? 1 : calcSumOfSquaresOfNumbersWithRecursion(n - 1) + (int)Math.pow(n, 2);
    }

    public static int calcSumOfSquaresOfNumbersWithoutRecursion(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) result += Math.pow(i, 2);
        return result;
    }
}
