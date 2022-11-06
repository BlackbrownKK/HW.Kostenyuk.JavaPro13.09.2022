package Shape;
public class Triangle implements Shape {
    double size;
    @Override
    public double calcSquare() {
        double square = 0.5 * size * (size * Math.sqrt(3) / 2);
        return square;
    }
    public Triangle(double size) {
        this.size = size;
    }
}
