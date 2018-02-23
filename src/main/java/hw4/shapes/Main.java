package hw4.shapes;

import hw4.shapes.model.*;

import java.util.Scanner;

public class Main {
    private static final Scanner userInput = new Scanner(System.in);
    private static final String MENU = "Выберите фигуру:\n" +
            "1. Квадрат\n" +
            "2. Прямоугольник\n" +
            "3. Круг \n" +
            "4. Треугольник\n" +
            "5. Выход\n";

    private static AbstractShape getShape(int value) {
        switch (value) {
            case 1:
                return new Square();
            case 2:
                return new Rectangle();
            case 3:
                return new Circle();
            case 4:
                return new Triangle();
            case 5:
            default:
                System.out.println("Выход из программы...");
                System.exit(0);

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(MENU);
        int value = userInput.nextInt();
        AbstractShape shape = getShape(value);
        System.out.println(shape.toString());
    }
}




