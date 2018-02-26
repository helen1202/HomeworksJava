package homeworks.hw4.shapes.model;

import java.util.Scanner;

public class Square extends AbstractShape {

    private int squareSide;
    private double squareFormula = squareSide * squareSide;
    private double perimeterFormula = 4 * squareSide;

    public Square() {
    }

    @Override
    public void createShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы выбрали квадрат.");
        System.out.println("Введите сторону квадрата: ");
        this.squareSide = sc.nextInt();
    }

    public double calculateSquareOfShape() {
        return squareFormula;
    }

    public double calculatePerimeterOfShape() {
        return perimeterFormula;
    }

    @Override
    public String toString(){
        return "Квадрат со стороной  " + squareSide + " имеет площадь " + calculateSquareOfShape()+
                " и периметр " + calculatePerimeterOfShape();
    }
}