package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();
        Vehicle vCar = new Car();
        Plane p = new Plane();

        //castTest(vehicle);
        castTest(car);
        //castTest(p);
    }

    private static void castTest(Vehicle v){
        v.start();
        Car cVehicle = (Car) v; // when we are sure that there is only car passing in the arguments
        cVehicle.start();
    }
}
