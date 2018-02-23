package hw4.shapes.factory;

import hw4.shapes.model.Rectangle;

public abstract class RectangleFactory extends ShapeFactory {

    @Override
    public Rectangle getShape() {
        return new Rectangle();
    }
}