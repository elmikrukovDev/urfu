package lr6.ex6;

public class IntStaticWorker {
    public static int[] subArray(int[] arr, int count) {
        if (count > arr.length) count = arr.length;
        var subArray = new int[count];
        for (int i = 0; i < count; i++)
            subArray[i] = arr[i];
        return subArray;
    }
}
