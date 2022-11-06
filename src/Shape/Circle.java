package Shape;
public class Circle implements Shape{
double size;
@Override
    public double calcSquare() {
        double square = Math.pow(this.size,2)*Math.PI;
        return square;
    }
    public Circle(double size) {
        this.size = size;
    }
}
