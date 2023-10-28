package builder;

public class SportsCarBuilder implements CarBuilder {

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    @Override
    public CarBuilder fixChassis() {
        System.out.println("Assembling chassis of the sport model");
        this.chassis = "Sport chassis";
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        System.out.println("Assembling body of the sport model");
        this.body = "Sport body";
        return this;
    }

    @Override
    public CarBuilder paint() {
        System.out.println("Painting the body of the sport model");
        this.paint = "Sports RM red paint";
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        System.out.println("Setting up the interior of the sport model");
        this.interior = "Sport interior";
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(chassis, body, paint, interior);
        if (car.doQualityCheck()) {
            return car;
        } else {
            System.out.println("Car assembly is incomplete. Can't deliver!");
            return null;
        }
    }

}
