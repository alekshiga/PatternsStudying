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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getEngines() {
        return engines;
    }

    public void setEngines(String engines) {
        this.engines = engines;
    }

    public boolean doQualityCheck() {
        return (name.trim() != null) && (wings.trim() != null) &&
                (chassis.trim() != null) && (engines.trim() != null);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Plane [name=").append(name).append("\n       wings=").append(wings).append("\n       chassis=").append(chassis).append("\n       engines=").append(engines).append("]");
        return builder.toString();
    }

}
