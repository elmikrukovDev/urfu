package lr8.ex10;

import java.io.*;

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
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\tmp\\f1.txt"), "cp1251"));
            pw = new PrintWriter("C:\\tmp\\f2.txt", "cp1251");
            int lineCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                out.printf("%d: %s\n", lineCount, line);
            }
            pw.flush();
        } finally {
            br.close();
            pw.close();
        }
    }
}
