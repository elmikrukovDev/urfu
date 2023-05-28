package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class ex5 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("qwerty1");
        list.add("qwerty2");
        list.add("qwerty3");
        list.add("3qwerty");
        list.add("4qwerty");
        list.add("4qwe5rty");
        var subs = getSubstringsInListStrings(list, "qwe5");
        for (var sub: subs) {
            out.println(sub);
        }
    }

    public static List<String> getSubstringsInListStrings(List<String> list, String sub) {
        return list.stream().filter((x) -> x.contains(sub)).collect(Collectors.toList());
    }
}
