package lr7.ex5;

public class SubClass1 extends SuperClass {
    protected String field1;

    protected int field2;

    public SubClass1(String arg1, int arg2) {
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
