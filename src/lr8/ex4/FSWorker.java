package lr8.ex4;

import java.io.*;

public class FSWorker {
    static void writeFloatsToFile(String path, float[] floats) throws IOException {
        DataOutputStream wr = null;
        try {
            wr = new DataOutputStream(new FileOutputStream(path));
            for (int i = 0; i < floats.length; i++)
                wr.writeFloat(floats[i]);
            wr.flush();
        } finally {
            wr.close();
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
}
