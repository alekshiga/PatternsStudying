package composite;

public interface Component {
    void add(Component component);
    void remove(Component component);
    double getPrice();
    int getPower();
}
