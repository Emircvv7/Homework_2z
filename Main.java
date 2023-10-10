public class Main {
    public static void main(String[] args) {
        Object[] objects = new Object[3];

        objects[0] = createObject("SecondClass", 42);
        objects[1] = createObject("ThirdClass", "Hello");
        objects[2] = createObject("FourthClass", 3.14);

        for (Object obj : objects) {
            if (obj instanceof Printable) {
                Printable printableObj = (Printable) obj;
                printableObj.print();
            }
        }
    }

    public static Object createObject(String className, Object... params) {
        switch (className) {
            case "SecondClass":
                if (params.length == 1 && params[0] instanceof Integer) {
                    return new SecondClass((Integer) params[0]);
                }
                break;
            case "ThirdClass":
                if (params.length == 1 && params[0] instanceof String) {
                    return new ThirdClass((String) params[0]);
                }
                break;
            case "FourthClass":
                if (params.length == 1 && params[0] instanceof Double) {
                    return new FourthClass((Double) params[0]);
                }
                break;
        }
        return null;
    }
}




