package homeworks.hw5.calculator;

public class Calculator {
    public double calculate(double val1, double val2, String operator) {
        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }

        return operation.resultFor(val1, val2);
    }

    private BinaryOperation getOperationFor(String operator) {
        if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)) {
            return new Substraction();
        } else if ("+".equals(operator)) {
            return new Addition();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("log".equals(operator)) {
            return new BaseLogarithm();
        } else if ("sqrt".equals(operator)) {
            return new SquareRoot();
        } else if ("^".equals(operator)) {
            return new Exponentiation();
        }
        return null;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.calculate(10.0, 50.2, "*"));
        System.out.println(calculator.calculate(44.9, 30.5, "-"));
        System.out.println(calculator.calculate(99999.097, 987.5, "+"));
        System.out.println(calculator.calculate(1000.69, 25.3, "/"));
        System.out.println(calculator.calculate(3, 2, "^"));
        System.out.println(calculator.calculate(100, 2, "log"));
        System.out.println(calculator.calculate(6.0, 3, "sqrt"));
    }
}
