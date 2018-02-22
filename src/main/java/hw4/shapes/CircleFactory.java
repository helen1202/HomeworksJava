package hw4.shapes;

public abstract class CircleFactory extends ShapeFactory {

    public Circle getCircle() {
        return new Circle();
    }
}
