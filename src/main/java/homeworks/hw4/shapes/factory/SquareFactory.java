package homeworks.hw4.shapes.factory;

import homeworks.hw4.shapes.model.Square;

public abstract class SquareFactory extends ShapeFactory {

    @Override
    public Square getShape() {
        return new Square();
    }

}
