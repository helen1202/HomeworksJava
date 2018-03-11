package homeworks.hw5.calculator;

import homeworks.hw5.calculator.mathExceptions.ImpossibleParseException;
import homeworks.hw5.calculator.mathExceptions.UnknownOperationException;
import homeworks.hw5.calculator.mathExceptions.WrongOperandsException;


public class Main {
    public static void main(String[] args) {
        System.out.printf("Введите выражение через пробел, которое необходимо вычислить, по типу X operator Y.\n" +
                "Возможные операторы:+, -, *, ^, /, log, sqrt\n");
        Calculator calculator = new Calculator();
        try {
            calculator.checkUserInput();
            calculator.calculate();
        } catch (WrongOperandsException e) {
            System.out.println(e.getMessage());
        } catch (ImpossibleParseException e) {
            System.out.println(e.getMessage());
        } catch (UnknownOperationException e) {
            System.out.println(e.getMessage());
        }

    }
}
