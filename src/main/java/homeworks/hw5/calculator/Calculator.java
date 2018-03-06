package homeworks.hw5.calculator;

import java.util.Scanner;

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
        System.out.println("Введите выражение, которое необходимо вычислить, по типу " +
                "\"X operator Y\": ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ExpressionParser parser = new ExpressionParser();
        parser.checkUserInput(input);
        Calculator calculator = new Calculator();



    }
}
