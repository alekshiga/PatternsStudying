package builder;

public class Main {

    public static void main(String[] args) {
        CarBuilder carbuilder = new ClassicCarBuilder();
        AutomotiveEngineer carengineer = new AutomotiveEngineer(carbuilder);
        Car car = carengineer.manufactureCar();
        if (car != null) {
            System.out.println("Car delivered: ");
            System.out.println("----------------------------------------------------------------------");
            System.out.println(car);
            System.out.println("----------------------------------------------------------------------\n\n\n\n");
        }

        PlaneBuilder planebuilder = new PassengerPlaneBuilder();
        PlaneEngineer planeengineer = new PlaneEngineer(planebuilder);
        Plane plane = planeengineer.manufacturePlane();
        if (plane != null) {
            System.out.println("Plane delivered");
            System.out.println("----------------------------------------------------------------------");
            System.out.println(plane);
            System.out.println("----------------------------------------------------------------------");
        }
    }
}