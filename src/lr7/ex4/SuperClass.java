package lr7.ex4;

public class SuperClass {
    public char field1;

    public SuperClass(char arg1) {
        field1 = arg1;
    }

    public SuperClass(SuperClass arg1) {
        field1 = arg1.field1;
    }
}
