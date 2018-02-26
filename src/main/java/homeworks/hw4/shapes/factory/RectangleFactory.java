package homeworks.hw4.shapes.factory;

import homeworks.hw4.shapes.model.Rectangle;

public abstract class RectangleFactory extends ShapeFactory {

    @Override
    public Rectangle getShape() {
        return new Rectangle();
    }
}