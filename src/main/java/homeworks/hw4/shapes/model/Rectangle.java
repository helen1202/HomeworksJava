package homeworks.hw4.shapes.model;

import java.util.Scanner;

public class Rectangle extends AbstractShape {

    private int rectangleSide1;
    private int rectangleSide2;
    private double squareFormula = rectangleSide1 * rectangleSide2;
    private double perimeterFormula = 2 * (rectangleSide1 + rectangleSide2);

    public Rectangle() {
    }

    public double calculateSquareOfShape() {
        return squareFormula;
    }

    public double calculatePerimeterOfShape() {
        return perimeterFormula;
    }

    /**
    Вот это вот все должно быть в конкретной реализации абстрактного класса 
    ShapeFactory 
    **/
    public void createShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы выбрали прямоугольник.");
        System.out.println("Введите длину прямоугольника: ");
        this.rectangleSide1 = sc.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        this.rectangleSide2 = sc.nextInt();
    }

    @Override
    public String toString(){
        return "Прямоугольник со сторонами " + rectangleSide1 + " и " + rectangleSide2 +
                " имеет площадь " + calculateSquareOfShape()+
                " и периметр " + calculatePerimeterOfShape();
    }
}
