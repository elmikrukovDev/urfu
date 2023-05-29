package lr10;

import org.w3c.dom.Element;

public class Book {
    private String name;
    public String getName() { return name; }
    private String author;
    public String getAuthor() { return author; }

    public Book(Element node) {
        this.name = node.getAttribute("Name");
        this.author = node.getAttribute("Author");
    }
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString() {
        return String.format("Book:\n" +
                             "\tName: %s\n" +
                             "\tAuthor: %s\n",
                             name, author);
    }
}
