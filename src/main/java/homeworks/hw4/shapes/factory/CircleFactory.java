package homeworks.hw4.shapes.factory;

import homeworks.hw4.shapes.model.Circle;

public abstract class CircleFactory extends ShapeFactory {

    @Override
    public Circle getShape() {
        return new Circle();
    }


}