package builder;

public interface PlaneBuilder {

    PlaneBuilder setName();

    PlaneBuilder fixWings();

    PlaneBuilder fixChassis();

    PlaneBuilder fixEngines();

    Plane build();

}
