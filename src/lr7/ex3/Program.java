package lr7.ex3;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        var superClass  = new SuperClass(1000);
        var subClass    = new SubClass(1001, 'a');
        var subSubClass = new SubSubClass(1002, 'b', "test");

        SuperClass poly = new SubSubClass(1003, 'c', "test1");

        out.println(subSubClass);
        out.println(subClass);
        out.println(superClass);
        out.println(poly);
        out.println("Poly.field1: " + poly.field1);
    }
}
