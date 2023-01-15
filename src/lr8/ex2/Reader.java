package lr8.ex2;

import java.io.IOException;
import java.io.InputStream;

import static java.lang.System.out;

public final class Reader {
    static void readAllByByteToConsole(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1)
                out.print((char)oneByte);
            else {
                out.print("\nend");
                break;
            }
        }
    }
}
