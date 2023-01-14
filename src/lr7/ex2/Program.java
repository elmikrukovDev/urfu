package lr7.ex2;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        var superClass = new SuperClass("testLineSuperClass");
        var subClass = new SubClass("testLineSubClass1", 1200);
        subClass.field1SetBaseValue();
        out.println(subClass.getField1Length());
    }
}
