package homeworks.hw5.calculator;

import homeworks.hw5.calculator.mathExceptions.ImpossibleParseException;

import static java.lang.Double.parseDouble;

//The conversion from String to primitive double may throw NFE(NumberFormatException)
// if the value in String is not convertible into a primitive double.
public class ExpressionParser {
    public void checkUserInput(String inputString) throws ImpossibleParseException{
        String [] mas = inputString.split(" ");
        if (mas.length==3) {
            double leftOperand = parseDouble(mas[0]);
            String operator = mas[1];
            double rightOperand = parseDouble(mas[2]);
        }
    }
}
