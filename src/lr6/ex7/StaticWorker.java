package lr6.ex7;

public class StaticWorker {
    public static int[] charsToCodes(char[] arr) {
        var codes = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            codes[i] = arr[i];
        return codes;
    }
}
