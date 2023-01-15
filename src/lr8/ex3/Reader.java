package lr8.ex3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import static java.lang.System.out;

public final class Reader {
    static void readAllByByteToConsole(InputStream in) throws IOException {
        var buf = new byte[5];
        while (true) {
            int count = in.read(buf);
            if (count != -1)
                out.printf("Count = %d, buff = %s, str = %s\n",
                           count,
                           Arrays.toString(buf),
                           new String(buf, 0, count, "UTF-8"));
            else
                break;
        }
    }
}
