package Shape;
public class Square implements Shape{
    double size;
    @Override
    public double calcSquare() {
        double square = Math.pow(size, 2);
        return square;
    }
    public Square(double size) {
        this.size = size;
    }
}
