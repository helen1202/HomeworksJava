package hw4.shapes;

public class Circle extends AbstractShape {
    private static int radius;

   Circle(int radius) {
    this.radius = radius;
   }

    @Override
    public double calculateSquareOfShape() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeterOfShape() {
        return 2 * Math.PI * radius;
    }
}
