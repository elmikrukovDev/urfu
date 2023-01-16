package lr6.ex3;

import org.jetbrains.annotations.NotNull;

public class IntStaticWorker {
    public static int getMin(@NotNull int[] vals) {
        int min = 0;
        for (int item: vals)
            if (item < min)
                min = item;
        return min;
    }

    public static int getMax(@NotNull int[] vals) {
        int max = 0;
        for (int item: vals)
            if (item > max)
                max = item;
        return max;
    }

    public static int getMiddle(@NotNull int ...vals) {
        int middle = 0;
        for (int item: vals)
            middle += item;
        return (int)Math.round((double)middle / (double)vals.length);
    }
}
