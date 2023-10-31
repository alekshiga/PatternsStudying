package builder;

public class PlaneEngineer {

    private final PlaneBuilder builder;

    PlaneEngineer(PlaneBuilder builder) {
        if (builder == null) {
            throw new IllegalArgumentException("Can't build a plane without a builder");
        } else {
            this.builder = builder;
        }
    }

    public Plane manufacturePlane() {
        return builder.setName().fixWings().fixChassis().fixEngines().build();
    }

}
