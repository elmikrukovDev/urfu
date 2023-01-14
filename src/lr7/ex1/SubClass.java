package lr7.ex1;

public final class SubClass extends SuperClass {
    private String field1;
    private String field2;

    public SubClass() { }

    public SubClass(String line1) {
        super(line1);
    }

    public SubClass(String line1, String line2) {
        field1 = line1;
        field2 = line2;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": \n" +
                "field1: " + field1 + ", \n" +
                "field2: " + field2 + ".";
    }
}
