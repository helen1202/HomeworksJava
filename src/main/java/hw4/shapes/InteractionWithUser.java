package hw4.shapes;

import java.util.Scanner;

public class InteractionWithUser {
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

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(MENU);
        if (userInput.hasNextInt()) {
            int value = userInput.nextInt();
            //p = new AbstarctShapeFactory
            //switch по p
           // case 1 - return new Circle()
            switch (value) {
                case 1:
                    System.out.println(squareMessage);
                    System.out.println("Введите сторону квадрата: ");
                    int squareSide = userInput.nextInt();
                    break;
                case 2:
                    System.out.println(rectangleMessage);
                    System.out.println("Введите длину прямоугольника: ");
                    int rectangleSide1 = userInput.nextInt();
                    System.out.println("Введите ширину прямоугольника: ");
                    int rectangleSide2 = userInput.nextInt();
                    break;
                case 3:
                    System.out.println(circleMessage);
                    System.out.println("Введите радиус круга: ");
                    int radius = userInput.nextInt();
                    break;
                case 4:
                    System.out.println(triangleMessage);
                    System.out.println("Введите сторону А треугольника: ");
                    int triangleSideA = userInput.nextInt();
                    System.out.println("Введите сторону В треугольника: ");
                    int triangleSideB = userInput.nextInt();
                    System.out.println("Введите сторону С треугольника: ");
                    int triangleSideC = userInput.nextInt();
                    break;
                case 5:
                    System.out.println(exitMessage);
                    break;
            }
        }

    }
}
