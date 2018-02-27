package homeworks.hw5.calculator;

public class Exponentiation implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, right);
    }
}
