package lr7.ex1;

public class SuperClass {
    private String field1;

    public SuperClass() { }

    public SuperClass(String line1) {
        field1 = line1;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": \n" +
                "field1: " + field1 + ".";
    }
}
