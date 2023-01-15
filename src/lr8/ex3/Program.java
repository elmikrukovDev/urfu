package lr8.ex3;

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
        var fileName = "C:\\tmp\\text.txt";
        InputStream inFile = null;
        try {
            inFile = new FileInputStream("C:\\tmp\\text.txt");
            Reader.readAllByByteToConsole(inFile);
        } finally {
            if (inFile != null) inFile.close();
        }
    }
}
