package composite;

public class Leaf implements Component, Cloneable {

    private String name;
    private double price;
    private int power;

    public Leaf(String name, double price, int power) {
        this.name = name;
        this.price = price;
        this.power = power;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getPower() {
        return this.power;
    }
}