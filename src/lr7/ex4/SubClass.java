package lr7.ex4;

public class SubClass extends SuperClass {
    public char field1;

    public String field2;

    public SubClass(char arg1, String arg2) {
        super(arg1);
        field1 = arg1;
        field2 = arg2;
    }

    public SubClass(SubClass arg1) {
        super(arg1.field1);
        field1 = arg1.field1;
        field2 = arg1.field2;
    }
}
