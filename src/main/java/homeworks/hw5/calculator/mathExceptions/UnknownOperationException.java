package homeworks.hw5.calculator.mathExceptions;

public class UnknownOperationException extends Exception{
    public UnknownOperationException(){
        super("Неверный ввод математической операции.");
    }
}
