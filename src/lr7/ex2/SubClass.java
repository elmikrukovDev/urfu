package lr7.ex2;

public final class SubClass extends SuperClass {
    private String field1;

    private int field2;

    public SubClass() { }

    public SubClass(String arg1, int arg2) {
        field1 = arg1;
        field2 = arg2;
    }

    public void field1SetValue() {
        field1 = "Base";
    }

    @Override
    public void field1SetValue(String arg1) {
        field1 = arg1;
    }

    public void field2SetValue(int arg1) {
        field2 = arg1;
    }

    public void field1AndField2SetValue(String arg1, int arg2) {
        field1 = arg1;
        field2 = arg2;
    }
}
