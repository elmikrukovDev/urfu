package lr10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.out;

public class task3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        Document doc = null;
        for (int attempt = 1; attempt <= 5; attempt++) {
            try {
                doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            } catch (IOException e) {
                if (attempt == 5)
                    throw new RuntimeException(e);
            }
        }

        var news = doc.select("body > table > tbody > tr > td >" +
                                       "div > table > tbody > tr:nth-child(5) > td:nth-child(3) >" +
                                       "table > tbody > tr > td:nth-child(1)");
        try {
            var file = new File("src/lr10/info.txt");
            fw = new FileWriter("src/lr10/info.txt", file.exists());
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    var nodes = news.get(0).childNodes();
                    fw.write(String.format("Тема: %s\nДата: %s\n",
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0),
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0)));
                }
            }
        } catch(IOException e) {
            out.println(e.getMessage());
        } finally {
            if (fw != null) fw.close();
        }
    }
}
