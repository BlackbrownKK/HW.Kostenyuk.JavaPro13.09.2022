package Shape;

public class App {
    static double sum=0;
    public static void main(String[] args) {
        Shape[] shapesAraysName = {new Circle(10), new Circle(5), new Square(10),
                new Triangle(11), new Triangle(1)};
        for (Shape EachElement : shapesAraysName) {
           sum = sum + EachElement.calcSquare();
        }
            System.out.printf("Area of all shapes: %.2f", sum);
    }
}

