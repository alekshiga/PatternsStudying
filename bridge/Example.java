package bridge;

public class Example {
    public static void main(String[] args) {
        Shape circle = new Circle(new Red());
        circle.draw();

        circle = new Circle(new Green());
        circle.draw();

    }
}
