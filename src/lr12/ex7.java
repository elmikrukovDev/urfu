package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class ex7 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("qwerty1");
        list.add("qwerty2");
        list.add("qwertfsy3");
        list.add("3qwerty");
        list.add("4vwefqweqwerty");
        list.add("4qwe5rty");
        var subs = getStringsMoreLength(list, 7);
        for (var sub: subs) {
            out.println(sub);
        }
    }

    public static List<String> getStringsMoreLength(List<String> list, int length) {
        return list.stream().filter((x) -> x.length() > length).collect(Collectors.toList());
    }
}
