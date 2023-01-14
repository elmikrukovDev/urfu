package lr7.ex2;

public class SuperClass {
    private String field1;

    public SuperClass() { }

    public SuperClass(String arg1) {
        field1 = arg1;
    }

    public int getField1Length() {
        return field1.length();
    }

    public void field1SetBaseValue() {
        field1 = "Base";
    }

    public void field1SetValue(String arg1) {
        field1 = arg1;
    }
}
