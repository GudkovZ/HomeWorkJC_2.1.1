public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public double divisionByZero(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("You can't divide by zero!");
        }
        return (a / b) ;
    }
}