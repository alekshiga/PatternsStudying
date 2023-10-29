package builder;

public class PassengerPlaneBuilder implements PlaneBuilder {

    private String name;
    private String wings;
    private String chassis;
    private String engines;

    @Override
    public PlaneBuilder setName() {
        System.out.println("Setting name for Passenger plane");
        this.name = "A737";
        return this;
    }

    @Override
    public PlaneBuilder fixWings() {
        System.out.println("Assembling wings for Passenger plane");
        this.wings = "Big Passenger plane wings";
        return this;
    }

    @Override
    public PlaneBuilder fixChassis() {
        System.out.println("Assembling lightweight Passenger plane chassis");
        this.chassis = "Lightweight Passenger chassis";
        return this;
    }

    @Override
    public PlaneBuilder fixEngines() {
        System.out.println("Assembling engines for Passenger plane");
        this.engines = "Passenger engines";
        return this;
    }

    @Override
    public Plane build() {
        Plane plane = new Plane(this.name, this.wings, this.chassis, this.engines);
        if (plane.doQualityCheck()) {
            return plane;
        } else {
            System.out.println("Assembling wasn't fully completed, can't release the plane");
            return null;
        }

    }
}
