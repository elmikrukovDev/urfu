package lr7.ex5;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        var superClass = new SuperClass("test1");
        var subClass1  = new SubClass1("test1", 1000);
        var subClass2  = new SubClass2("test2", 'a');

        out.println(superClass);
        out.println(subClass1);
        out.println(subClass2);

        SuperClass var = new SubClass1("test3", 1001);

        out.println(var);
    }
}
