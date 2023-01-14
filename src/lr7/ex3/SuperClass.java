package lr7.ex3;

public class SuperClass {
    public int field1;

    public SuperClass(int arg1) {
        field1 = arg1;
    }

    public void fieldsSetValue(int arg1) {
        field1 = arg1;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": \n" +
                "field1: " + field1 + ".";
    }
}
