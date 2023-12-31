package bridge;

import java.sql.SQLOutput;

public class Circle implements Shape {

    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
        this.color.applyColor();
    }
}
