package lr8.ex5;

import java.io.*;
import static java.lang.System.out;

public class FSWorker {
    static void writeStringsToFile(String path, String[] lines) throws IOException {
        DataOutputStream outS = null;
        try {
            outS = new DataOutputStream(new FileOutputStream(path));
            for (int i = 0; i < lines.length; i++)
                outS.writeUTF(lines[i]);
            outS.flush();
        } finally {
            outS.close();
        }
    }

    static void copyFile(String path, String newPath) throws IOException {
        DataInputStream rd = null;
        DataOutputStream wr = null;
        try {
            rd = new DataInputStream(new FileInputStream(path));
            wr = new DataOutputStream(new FileOutputStream(newPath));
            while (true) {
                try {
                    wr.writeFloat(rd.readFloat());
                } catch (EOFException e) {
                    break;
                }
            }
            wr.flush();
        } finally {
            rd.close();
            wr.close();
        }
    }

    public static void printFilesData(String path) throws IOException {
        DataInputStream rd = null;
        try {
            rd = new DataInputStream(new FileInputStream(path));
            while (true) {
                try {
                    out.println(rd.readUTF());
                } catch (EOFException e) {
                    break;
                }
            }
        } finally {
            rd.close();
        }
    }
}
