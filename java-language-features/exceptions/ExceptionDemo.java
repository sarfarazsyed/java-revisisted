public class ExceptionDemo {

    // throws demo
    static int divide(int x, int y) throws ArithmeticException {
        return x / y;
    }

    // throw demo
    static int division(int x, int y) {
        if (y == 0)
            try {
                throw new Exception("Divide by zero is not possible");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return 0;
            }
        return x / y;
    }

    static int divisionWithCustomException(int x, int y) throws MyException {
        if (y == 0)
            throw new MyException("Divide by zero is not possible");
        return x / y;
    }

    public static void main(String[] args) {
        int x = 10, y = 0;

        // try - catch demo
        try {
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // try - catch - finally demo
        try {
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally method executed");
        }

        try {
            int z = divide(x, y);
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        int z = division(x, y);
        System.out.println(z);

        try {
            int result = divisionWithCustomException(x, y);
            System.out.println(result);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

// custom Exception
class MyException extends Exception {

    private static final long serialVersionUID = 1L;

    MyException(String s) {
        super(s);
    }
}
