package hw4.shapes;

public abstract class RectangleFactory extends ShapeFactory {

    @Override
    public Rectangle getRectangle() {
        return new Rectangle();
        }
        }
