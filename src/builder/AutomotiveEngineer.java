package builder;

public class AutomotiveEngineer {

    private CarBuilder builder;

    public AutomotiveEngineer(CarBuilder builder) {
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Automotive engineer can't work without Car Builder");
        }
    }

    public Car manufactureCar() {
        return builder.fixChassis().fixBody().paint().fixInterior().build();
    }
}