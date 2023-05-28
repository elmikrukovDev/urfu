package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class ex10 {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(9);
        list.add(7);
        list.add(5);
        list.add(3);
        var subs = getNumbersLessNumber(list, 5);
        for (var sub: subs) {
            out.println(sub);
        }
    }

    public static List<Integer> getNumbersLessNumber(List<Integer> list, int number) {
        return list.stream().filter((x) -> x < number).collect(Collectors.toList());
    }
}
