package lr10;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

import static java.lang.System.out;

public class Library {
    public static void delBook(String xml, String name) throws IOException, SAXException, ParserConfigurationException, TransformerException {
        var file = new File(xml);
        var dBuilderFac = DocumentBuilderFactory.newInstance();
        var dBuilder = dBuilderFac.newDocumentBuilder();
        var doc = dBuilder.parse(file);
        var root = doc.getDocumentElement();
        var books = doc.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            var node = books.item(i);
            if (node.getNodeType() != Node.ELEMENT_NODE) continue;
            if (((Element)node).getAttribute("Name").equals(name))
                root.removeChild(node);
        }
        doc.setXmlStandalone(true);
        doc.normalizeDocument();
        var tf = TransformerFactory.newInstance();
        var tr = tf.newTransformer();
        tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        tr.setOutputProperty(OutputKeys.STANDALONE, "yes");
        tr.setOutputProperty(OutputKeys.INDENT, "yes");
        var dom = new DOMSource(doc);
        var result = new StreamResult(file);
        tr.transform(dom, result);
    }

    public static void addBook(String xml, Book book) throws IOException, SAXException, ParserConfigurationException, TransformerException {
        var file = new File(xml);
        var dBuilderFac = DocumentBuilderFactory.newInstance();
        var dBuilder = dBuilderFac.newDocumentBuilder();
        var doc = dBuilder.parse(file);
        var root = doc.getDocumentElement();
        var child = doc.createElement("book");
        child.setAttribute("Name", book.getName());
        child.setAttribute("Author", book.getAuthor());
        root.appendChild(child);
        doc.setXmlStandalone(true);
        doc.normalizeDocument();
        var tf = TransformerFactory.newInstance();
        var tr = tf.newTransformer();
        tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        tr.setOutputProperty(OutputKeys.STANDALONE, "yes");
        tr.setOutputProperty(OutputKeys.INDENT, "yes");
        var dom = new DOMSource(doc);
        var result = new StreamResult(file);
        tr.transform(dom, result);
    }

    public static void printBooks(String xml) throws IOException, SAXException, ParserConfigurationException {
        var file = new File(xml);
        var dBuilderFac = DocumentBuilderFactory.newInstance();
        var dBuilder = dBuilderFac.newDocumentBuilder();
        var doc = dBuilder.parse(file);
        var books = doc.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            var node = books.item(i);
            if (node.getNodeType() != Node.ELEMENT_NODE) continue;
            out.println(new Book((Element)node));
        }
    }

    public static void findBooksByAuthor(String xml, String author) throws ParserConfigurationException, IOException, SAXException {
        var file = new File(xml);
        var dBuilderFac = DocumentBuilderFactory.newInstance();
        var dBuilder = dBuilderFac.newDocumentBuilder();
        var doc = dBuilder.parse(file);
        var books = doc.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            var node = books.item(i);
            if (node.getNodeType() != Node.ELEMENT_NODE) continue;
            var book = new Book((Element)node);
            if (book.getAuthor().equals(author)) out.println(book);
        }
    }
}
