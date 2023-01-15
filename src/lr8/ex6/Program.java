package lr8.ex6;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;
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
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader("C:\\tmp\\f1.txt");
            writer = new FileWriter("C:\\tmp\\f2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                var ch = (char)oneByte;
                out.write(ch);
                out.append(ch);
                out.print(ch);
            }
        } finally {
            reader.close();
            writer.close();
        }
    }
}
