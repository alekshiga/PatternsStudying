package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private String name;

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public double getPrice() {
        int totalPrice = 0;
        for (Component component : components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int getPower() {
        int totalPower = 0;
        for (Component component : components) {
            totalPower += component.getPower();
        }
        return totalPower;
    }
}
