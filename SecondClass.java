public class SecondClass extends FirstClass implements Printable {
    private int field2;

    public SecondClass(int field2) {
        this.field2 = field2;
    }

    public int getField2() {
        return field2;
    }

    @Override
    public void print() {
        System.out.println("SecondClass: Field2 = " + field2);
    }
}


