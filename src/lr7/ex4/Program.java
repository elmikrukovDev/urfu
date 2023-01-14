package lr7.ex4;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        SuperClass var1 = new SubSubClass('a', "test", 1000);
        SuperClass var2 = new SuperClass(var1);

        out.println("Значение поля 3-го класса в цепочке наследования №1: " + var1.field1);
        out.println("Значение поля 3-го класса в цепочке наследования №1 (copy): " + var2.field1);
        var1.field1 = 'b';
        var2.field1 = 'c';
        out.println("Значение поля 3-го класса в цепочке наследования №1: " + var1.field1);
        out.println("Значение поля 3-го класса в цепочке наследования №1 (copy): " + var2.field1);
    }
}
