package hw4.shapes.factory;

import hw4.shapes.model.Square;

public abstract class SquareFactory extends ShapeFactory {

    @Override
    public Square getShape() {
        return new Square();
    }

}
