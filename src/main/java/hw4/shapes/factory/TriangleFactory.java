package hw4.shapes.factory;

import hw4.shapes.model.Triangle;

public abstract class TriangleFactory extends ShapeFactory {

    @Override
    public Triangle getShape() {
        return new Triangle();
    }
}
