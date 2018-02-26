package homeworks.hw4.shapes.model;
import java.util.Scanner;

public class Circle extends AbstractShape {

    private int radius;
    private double squareFormula = Math.PI * radius * radius;
    private double perimeterFormula = 2 * Math.PI * radius;

    public Circle() {
    }

    @Override
    public double calculateSquareOfShape() {
        return squareFormula;
    }

    @Override
    public double calculatePerimeterOfShape() {
        return perimeterFormula;
    }

    @Override
    public void createShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы выбрали круг.");
        System.out.println("Введите радиус круга: ");
        this.radius = sc.nextInt();
    }

    @Override
    public String toString(){
        return "Круг с радиусом " + radius + " имеет площадь " + calculateSquareOfShape()+
                " и периметр " + calculatePerimeterOfShape();
    }

}