package lr8.ex2;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        try {
            start();
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }

    private static void start() throws Exception {
        InputStream inFile = null, inUrl = null, inArray = null;
        try {
            inFile = new FileInputStream("C:\\tmp\\text.txt");
            Reader.readAllByByteToConsole(inFile);
            out.print("\n\n\n");
            inUrl = new URL("http://google.com").openStream();
            Reader.readAllByByteToConsole(inUrl);
            out.print("\n\n\n");
            inArray = new ByteArrayInputStream(new byte[] { 7, 9, 3, 7, 4 });
            Reader.readAllByByteToConsole(inArray);
            out.print("\n\n\n");
        } finally {
            if (inFile != null) inFile.close();
            if (inUrl != null) inUrl.close();
            if (inArray != null) inArray.close();
        }
    }
}
