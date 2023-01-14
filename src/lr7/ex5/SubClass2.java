package lr7.ex5;

public class SubClass2 extends SuperClass {
    protected String field1;

    protected char field2;

    public SubClass2(String arg1, char arg2) {
        super(arg1);
        field1 = arg1;
        field2 = arg2;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": \n" +
                "field1: " + field1 + "," +
                "field2: " + field2 + ".";
    }
}
