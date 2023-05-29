package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Arrays;

import static java.lang.System.out;

public class task2 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject)parser.parse(new FileReader("src/lr10/lib.json"));
            JSONArray arr = (JSONArray) obj.get("books");
            for (var o: arr)
                out.print(bookToString((JSONObject) o));
            String author = "John Doe";
            Arrays.stream(arr.toArray())
               .filter(book -> book instanceof JSONObject)
               .map(book -> (JSONObject)book)
               .filter(book -> author.equals(book.get("author")))
               .forEach(book -> out.print(bookToString(book)));
            JSONObject newBook = new JSONObject();
            newBook.put("title", "Новая книга");
            newBook.put("author", "Новый автор");
            newBook.put("year", 2023);
            arr.add(newBook);
            for (var o: arr)
                out.print(bookToString((JSONObject) o));
            String title = "Новая книга";
            var iterator = arr.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (title.equals(book.get("title")))
                    iterator.remove();
            }

            for (var o: arr)
                out.print(bookToString((JSONObject) o));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String bookToString(JSONObject o) {
        var book = (JSONObject)o;
        return String.format("Название книги: %s\n" +
                             "Автор: %s\n" +
                             "Год: %s\n",
                             book.get("title"),
                             book.get("author"),
                             book.get("year"));
    }
}
