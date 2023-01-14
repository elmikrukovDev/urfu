package lr7.ex4;

public class SubSubClass extends SubClass {
    public char field1;

    public String field2;

    public int field3;

    public SubSubClass(char arg1, String arg2, int arg3) {
        super(arg1, arg2);
        field1 = arg1;
        field2 = arg2;
        field3 = arg3;
    }

    public SubSubClass(SubSubClass arg1) {
        super(arg1.field1, arg1.field2);
        field1 = arg1.field1;
        field2 = arg1.field2;
        field3 = arg1.field3;
    }
}
