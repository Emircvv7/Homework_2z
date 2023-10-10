public class ThirdClass extends FirstClass implements Printable {
    private String field3;

    public ThirdClass(String field3) {
        this.field3 = field3;
    }

    public String getField3() {
        return field3;
    }

    @Override
    public void print() {
        System.out.println("ThirdClass: Field3 = " + field3);
    }
}


