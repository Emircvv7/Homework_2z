public class FourthClass extends FirstClass implements Printable {
    private double field4;

    public FourthClass(double field4) {
        this.field4 = field4;
    }

    public double getField4() {
        return field4;
    }

    @Override
    public void print() {
        System.out.println("FourthClass: Field4 = " + field4);
    }
}


