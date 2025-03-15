package Lab5;
public class Lab5 {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", true);
        System.out.println(shape);

        Circle circle = new Circle(2.5, "yellow", true);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(2, 4, "blue", true);
        System.out.println(rectangle);

        Square square = new Square(3, "green", false);
        System.out.println(square);
    }
}