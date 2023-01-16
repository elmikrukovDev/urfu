package lr6.ex4;

public class IntStaticWorker {
    public static int calcDoubleFactorialWithRecursion(int n) {
        int k = n % 2 == 0 ? 2 : 1;
        return n == k ? k : n * calcDoubleFactorialWithRecursion(n - 2);
    }

    public static int calcDoubleFactorialWithoutRecursion(int n) {
        int k = n % 2 == 0 ? 2 : 1, result = 1;
        for (int i = k; i <= n; i += 2) result *= i;
        return result;
    }
}
