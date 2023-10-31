package builder;

public class Plane {

    private String name;
    private String wings;
    private String chassis;
    private String engines;

    public Plane(String name, String wings, String chassis, String engines) {
        this.name = name;
        this.wings = wings;
        this.chassis = chassis;
        this.engines = engines;
    }

    public boolean doQualityCheck() {
        return (name != null) && (wings != null) &&
                (chassis != null) && (engines != null);
    }

    @Override
    public String toString() {
        return "Plane [name=" + name + "\n       wings=" + wings + "\n       chassis=" + chassis + "\n       engines=" + engines + "]";
    }

}
