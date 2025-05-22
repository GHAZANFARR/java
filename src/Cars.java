  public class Cars { //taking it for an "Instance Variables And Methods" example

    int noOfWheels;

    String color;

    int noOfSeats;

    float currentFuelInLiters;

    float currentSpeed;

    float maxSpeed;

    String fuelType;

    public void drive(){
        System.out.println("The Car is driving");
        currentFuelInLiters--;
    }

    public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuel() {
        System.out.println("current fuel is: " + currentFuelInLiters);
        return currentFuelInLiters;
    }

    public void acceleration(float posSpeed){
        currentSpeed += posSpeed;
    }

    public void deceleration(float negSpeed) {
        currentSpeed -= negSpeed;
    }

    public float getCurrentSpeed(){
        System.out.println("current speed is: " + currentSpeed);
        return currentSpeed;
    }
    }