package hw4.shapes;

import java.util.Scanner;

public abstract class ShapeFactory {
    private static final String MENU = "Выберите фигуру:\n" +
            "1. Квадрат\n" +
            "2. Прямоугольник\n" +
            "3. Круг \n" +
            "4. Треугольник\n" +
            "5. Выход\n";
    private static final String squareMessage = "Вы выбрали квадрат.";
    private static final String circleMessage = "Вы выбрали круг.";
    private static final String rectangleMessage = "Вы выбрали прямоугольник.";
    private static final String triangleMessage = "Вы выбрали треугольник.";
    private static final String exitMessage = "Выход";

    public abstract Circle getCircle(int radius);

    public abstract Rectangle getRectangle();

    public abstract Square getSquare();

    public abstract Triangle getTriangle();

    Scanner sc = new Scanner(System.in);

    public void interactWithUser(){
        System.out.println(MENU);

    }

}
