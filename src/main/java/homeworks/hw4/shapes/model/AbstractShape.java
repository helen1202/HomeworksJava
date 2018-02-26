package homeworks.hw4.shapes.model;

public abstract class AbstractShape {

    public abstract double calculateSquareOfShape();

    public abstract double calculatePerimeterOfShape();

    public abstract void createShape();

    public AbstractShape() {
        createShape();
    }
}
