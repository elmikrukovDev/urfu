package lr7.ex3;

public class SubSubClass extends SubClass {
    public int field1;

    public char field2;

    public String field3;

    public SubSubClass(int arg1, char arg2, String arg3) {
        super(arg1, arg2);
        field1 = arg1;
        field2 = arg2;
        field3 = arg3;
    }

    public void fieldsSetValue(int arg1, char arg2, String arg3) {
        field1 = arg1;
        field2 = arg2;
        field3 = arg3;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": \n" +
                "field1: " + field1 + ", \n" +
                "field2: " + field2 + ", \n" +
                "field3: " + field3 + ".";
    }
}
