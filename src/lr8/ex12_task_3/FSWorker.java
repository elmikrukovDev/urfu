package lr8.ex12_task_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FSWorker {
    static <T> void writeParamsToFile(String path, boolean append, T ...collection) throws IOException {
        writeCollectionToFile(path, append, collection);
    }

    static <T> void writeCollectionToFile(String path, boolean append, T[] collection) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path, append));
            for (int i = 0; i < collection.length; i++)
                bw.write(String.valueOf(collection[i]));
        } finally {
            bw.close();
        }
    }

    static <T> void writeCollectionToFile(String path, boolean append, T[] collection, String splitter) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path, append));
            for (int i = 0; i < collection.length; i++)
                bw.write(String.valueOf(collection[i]) + splitter);
        } finally {
            bw.close();
        }
    }

    static <T> void writeCollectionToFile(String path, boolean append, List<T> collection) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path, append));
            for (int i = 0; i < collection.size(); i++)
                bw.write(String.valueOf(collection.get(i)));
        } finally {
            bw.close();
        }
    }

    static <T> void writeCollectionToFile(String path, boolean append, List<T> collection, String splitter) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path, append));
            for (int i = 0; i < collection.size(); i++)
                bw.write(String.valueOf(collection.get(i)) + splitter);
        } finally {
            bw.close();
        }
    }

    static ArrayList<String> readFileToCollection(String path) throws IOException {
        var fileInfo = new ArrayList<String>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine()) != null)
                fileInfo.add(line);
        } finally {
            br.close();
        }
        return fileInfo;
    }
}
