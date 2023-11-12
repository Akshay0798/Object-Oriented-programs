package Example1;

public class Main {
    public static void main(String[] args) {
        Shapes_Super shape = new Shapes_Super();
        Circle_Sub circle = new Circle_Sub();
        Square_Sub square = new Square_Sub();
        Triangle_Sub triangle = new Triangle_Sub();

        shape.Area();
        circle.Area();
        square.Area();
        triangle.Area();



    }
}
