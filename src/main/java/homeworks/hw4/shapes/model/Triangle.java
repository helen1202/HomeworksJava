package homeworks.hw4.shapes.model;

import java.util.Scanner;

public class Triangle extends AbstractShape{
    private int side1;
    private int side2;
    private int side3;
    private double perimeterFormula = side1 + side2 + side3;
    private double p = perimeterFormula/2;
    private double squareFormula = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));


    public Triangle() {

    }

    public void createShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы выбрали треугольник.");
        System.out.println("Введите сторону А треугольника: ");
        this.side1 = sc.nextInt();
        System.out.println("Введите сторону В треугольника: ");
        this.side2 = sc.nextInt();
        System.out.println("Введите сторону С треугольника: ");
        this.side3 = sc.nextInt();
    }

    public double calculateSquareOfShape() {
        return squareFormula;
    }

    public double calculatePerimeterOfShape() {
        return perimeterFormula;
    }

    @Override
    public String toString(){
        return "Треугольник со сторонами " + side1 + ", " + side2 + " и " + side3 +
                " имеет площадь " + calculateSquareOfShape()+
                " и периметр " + calculatePerimeterOfShape();
    }
}
