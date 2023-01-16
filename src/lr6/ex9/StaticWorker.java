package lr6.ex9;

public class StaticWorker {
    public static char[] pairwiseReplase(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            var temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
