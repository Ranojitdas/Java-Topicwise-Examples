public class TestTransportation {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();
        Vehicle vCar = new Car();
        Plane p = new Plane();

//        Car VCar = (Car) new Vehicle();

    }

    private static void castTest(Vehicle veh){
            veh.start();
            Car cVehicle = (Car) veh;
    }

}
