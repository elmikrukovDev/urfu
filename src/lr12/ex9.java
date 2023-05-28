package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class ex9 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("qwedfgsfrty");
        list.add("qwerty");
        list.add("qwertfsy3");
        list.add("3qwerty");
        list.add("4vwefqweqwerty");
        list.add("vwefq,weqwerty");
        list.add("4qwe5rty");
        var subs = getStringsWithLetters(list);
        for (var sub: subs) {
            out.println(sub);
        }
    }

    public static List<String> getStringsWithLetters(List<String> list) {
        return list.stream().filter((x) -> Arrays.stream(x.chars()
                                                          .toArray())
                                                 .allMatch(y -> Character.isLetter(y)))
                            .collect(Collectors.toList());
    }
}
