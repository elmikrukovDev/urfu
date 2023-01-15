package lr8.ex8;

import java.io.*;
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
        Reader rFile = null, rUrl = null, rArray = null;
        try {
            inFile = new FileInputStream("E:\\MyFile1.txt");
            rFile= new InputStreamReader(inFile,"cp1251");
            FSWorker.readAllByByte(rFile);
            System.out.print("\n\n\n");

            inUrl = new URL("http://google.com").openStream();
            rUrl  = new InputStreamReader(inUrl, "cp1251");
            FSWorker.readAllByByte(rUrl);
            System.out.print("\n\n\n");

            inArray = new ByteArrayInputStream( new byte[] { 5, 8, 3, 9, 11 });
            rArray = new InputStreamReader(inArray,"cp1251");
            FSWorker.readAllByByte(rArray);
            System.out.print("\n\n\n");
        } finally {
            inFile.close();
            rFile.close();
            inUrl.close();
            rUrl.close();
            inArray.close();
            rArray.close();
        }
    }
}
