package hw4.shapes;

public class Circle extends AbstractShape{
    private static  int radius;

    Circle(int radius){
       this.radius = radius;
    }

    @Override
    public int calculateSquareOfShape() {

        return Math.PI*radius*radius;


        return 0;
    }

    public int calculatePerimeterOfShape() {
        return 0;
    }
}
