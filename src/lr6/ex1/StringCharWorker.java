package lr6.ex1;

import org.jetbrains.annotations.NotNull;
import static java.lang.System.out;

public class StringCharWorker {
    private char char1;
    private String string1;
    public void setValue(char val) {
        char1 = val;
    }
    public void setValue(String val) {
        string1 = val;
    }
    public void setValue(@NotNull char[] val) throws IllegalArgumentException {
        if (val.length == 0)
            throw new IllegalArgumentException("не может быть пустой массив");
        else if (val.length == 1)
            char1 = val[0];
        else
            string1 = String.valueOf(val);
    }

    public void print() {
        out.printf("char - %s, string - %s\n", char1, string1);
    }
}
