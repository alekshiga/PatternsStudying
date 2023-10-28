package builder;

import builder.CarBuilder;

import java.sql.SQLOutput;

public class ClassicCarBuilder implements CarBuilder {

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    public ClassicCarBuilder() {
        super();
    }

    @Override
    public CarBuilder fixChassis() {
        System.out.println("Assembling chassis of the classical model");
        this.chassis = "Classic chassis";
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        System.out.println("Assembling body of the classical model");
        this.body = "Classic body";
        return this;
    }

    @Override
    public CarBuilder paint() {
        System.out.println("Painting the body of the classical model");
        this.paint = "Classic white paint";
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        System.out.println("Setting up the interior of the classical model");
        this.interior = "Classic interior";
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(chassis, body, paint, interior);
        if (car.doQualityCheck()) {
            return car;
        } else {
            System.out.println("Car wasn't fully assembled, can't release it");
            return null;
        }
    }
}
