package builder;

public interface PlaneBuilder {

    public PlaneBuilder setName();

    public PlaneBuilder fixWings();

    public PlaneBuilder fixChassis();

    public PlaneBuilder fixEngines();

    public Plane build();

}
