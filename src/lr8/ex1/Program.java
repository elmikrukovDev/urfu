package lr8.ex1;

import java.io.File;
import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        try {
            var f1 = new File("MyFile.txt");
            f1.createNewFile();
            FileExists(f1);
            var f2 = new File("E:\\MyFile.txt");
            f2.createNewFile();
            FileExists(f2);
            var f3 = new File("E:\\Dir1\\Dir2\\Dir3");
            f3.mkdirs();
            FileExists(f3);
        } catch (Exception e) {
            out.println("Error - " + e);
        }
    }

    private static void FileExists(File f) throws Exception {
        if (f.exists()) {
            out.println("Created");
            out.println("Full path - " + f.getAbsolutePath());
        }
        else {
            throw new Exception(String.format("Файл \"%s\" не создан!", f.getName()));
        }
    }
}
