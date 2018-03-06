package homeworks.hw4.shapes;

import homeworks.hw4.shapes.model.*;

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
        //тут нужно создать конкретную ShapeFactory 
        //ShapeFactory shapeFactory;
        switch (value) {
            case 1:
                //shapeFactory = new SquareFactory();
                //break;
                return new Square();
            case 2:
                //shapeFactory = new RectangleFactory();
                //break;
                return new Rectangle();
            case 3:
                //shapeFactory = new SquareFactory();
                //break;
                return new Circle();
            case 4:
                //shapeFactory = new TriangleFactory();
                //break;
                return new Triangle();
            case 5:
            default:
                System.out.println("Выход из программы...");
                System.exit(0);

        }
        //вот тут вернуть фигуру
        //return shapeFactory.getShape();
        return null;
    }

    public static void main(String[] args) {
        System.out.println(MENU);
        //А если я введу букву, то программа вылетит по эксепшену, не хорошо 
        //Вы же как тестеры знаете, что пользователь обязательно введет что то не то :)
        int value = userInput.nextInt();
        AbstractShape shape = getShape(value);
        System.out.println(shape.toString());
    }
}




