package lr7.ex5;

public class SuperClass {
    protected String field1;

    public SuperClass(String arg1) {
        field1 = arg1;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": \n" +
                "field1: " + field1 + ".";
    }
}
