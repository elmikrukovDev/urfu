package lr7.ex3;

public class SubClass extends SuperClass {
    public int field1;

    public char field2;

    public SubClass(int arg1, char arg2) {
        super(arg1);
        field1 = arg1;
        field2 = arg2;
    }

    public void fieldsSetValue(int arg1, char arg2) {
        field1 = arg1;
        field2 = arg2;
    }
    @Override
    public String toString() {
        return this.getClass().getName() + ": \n" +
                "field1: " + field1 + ", \n" +
                "field2: " + field2 + ".";
    }

}
