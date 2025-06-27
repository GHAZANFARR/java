import java.util.Scanner;

public class Cars { // Instance Variables And Methods example

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cars{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", start=").append(start);
        sb.append(", color='").append(color).append('\'');
        sb.append(", noOfSeats=").append(noOfSeats);
        sb.append(", currentFuelInLiters=").append(currentFuelInLiters);
        sb.append(", maxFuelCapacity=").append(maxFuelCapacity);
        sb.append(", unitOfFuelFilledAtMax=").append(unitOfFuelFilledAtMax);
        sb.append(", currentSpeed=").append(currentSpeed);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", fuelType='").append(fuelType).append('\'');
        sb.append('}');
        return sb.toString();
    }

    int noOfWheels;
    boolean start = false;
    String color;
    int noOfSeats;
    float currentFuelInLiters;
    int maxFuelCapacity;
    float unitOfFuelFilledAtMax;
    float currentSpeed;
    float maxSpeed;
    String fuelType; //not recommended to finalize();

    private static final float FUEL_COST_PER_LITER = 110.2f;

    public void costing() {
        System.out.println("costing till yet is: " + currentFuelInLiters * FUEL_COST_PER_LITER);
    }

    public void carStart(){
        if (currentFuelInLiters <= 0) {
            System.out.println("car is out of fuel, cant drive");
            start = false;
        } else {
            System.out.println("car has started... ready to go");
        }
    }

    public void drive() {
        if (currentFuelInLiters > 0) {
            System.out.println("The Car is driving");
            currentFuelInLiters--;
        } else System.out.println("Car is out of fuel :(");
    }

    public void addFuel(float posFuel) {
        if (posFuel > 0) {
            this.currentFuelInLiters += posFuel;
        } else this.currentFuelInLiters = 0;
    }

    public void getCurrentFuel() {
        System.out.println("current fuel is: " + currentFuelInLiters);
    }

    public void acceleration(float posSpeed) {
        if (currentSpeed > 0) {
            currentSpeed += posSpeed;
        } else currentSpeed = 0;
    }

    public void deceleration(float negSpeed) {
        if (currentSpeed > 0) {
            currentSpeed -= negSpeed;
        } else currentSpeed = 0;
    }

    public void getCurrentSpeed() {
        System.out.println("current speed is: " + currentSpeed);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cars car = new Cars();

        collectCarAttributes(scanner, car);
        start(scanner,car);
        if(car.start) {
            handleSpeedChange(scanner, car);
            handleFuelChange(scanner, car);
            handleDriving(scanner, car);
        }
        car.costing();
        printCarSummary(car);

        scanner.close();
    }

    private static void start(Scanner scanner, Cars car) {

        System.out.println("does car start??: (yes/no)");
        String yesNo = scanner.nextLine();

        if(yesNo.equalsIgnoreCase("yes")) {
            car.start = true;
            car.carStart();
        }
    }

    private static void collectCarAttributes(Scanner scanner, Cars car) {
        System.out.print("enter the Current Fuel Level: ");
        car.currentFuelInLiters = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("enter the Fuel Type: ");
        car.fuelType = scanner.nextLine();

        System.out.print("enter the Max Speed of Car: ");
        car.maxSpeed = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("enter the Number of wheels in car: ");
        car.noOfWheels = scanner.nextInt();
        scanner.nextLine();

        System.out.print("enter the number of Seat: ");
        car.noOfSeats = scanner.nextInt();
        scanner.nextLine();

        System.out.print("enter the max fuel capacity: ");
        car.maxFuelCapacity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("enter the Current Speed of Car: ");
        car.currentSpeed = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("enter the Color of Car: ");
        car.color = scanner.nextLine();
    }

    private static void handleSpeedChange(Scanner scanner, Cars car) {
        boolean change = readYesNo(scanner, "does the speed of car change? (yes/no): ");
        if (change) {
            System.out.print("does speed increase or decrease: ");
            String speedChange = scanner.nextLine();

            if (speedChange.equalsIgnoreCase("increase")) {
                System.out.print("enter the increment in speed: ");
                float posSpeed = scanner.nextFloat();
                scanner.nextLine();
                car.acceleration(posSpeed);

            } else {
                System.out.print("enter the decrement in speed: ");
                float negSpeed = scanner.nextFloat();
                scanner.nextLine();
                car.deceleration(negSpeed);
            }

            car.getCurrentSpeed();
        }
    }

    private static void handleFuelChange(Scanner scanner, Cars car) {

        boolean fillMax = readYesNo(scanner, "do you want to fill the tank to max? (yes/no): ");
        if (fillMax) {
            float fuelBeforeFill = car.currentFuelInLiters;
            car.currentFuelInLiters = car.maxFuelCapacity;
            car.unitOfFuelFilledAtMax = car.maxFuelCapacity - fuelBeforeFill;
        } else {
            boolean fuelChange = readYesNo(scanner, "does the Fuel Levels of car change? (yes/no): ");
            if (fuelChange) {
                System.out.print("does fuel increase or decrease: ");
                String fuelChangeInLiters = scanner.nextLine();

                if (fuelChangeInLiters.equalsIgnoreCase("increase")) {
                    System.out.print("enter the incremented in fuel: ");
                    float posFuel = scanner.nextFloat();
                    scanner.nextLine();
                    car.addFuel(posFuel);
                    if (car.currentFuelInLiters > car.maxFuelCapacity) { //stop overflow
                        car.currentFuelInLiters = car.maxFuelCapacity;
                    }

                } else {
                    System.out.print("enter the decrement in fuel: ");
                    float negFuel = scanner.nextFloat();
                    scanner.nextLine();
                    car.currentFuelInLiters -= negFuel;
                    if (car.currentFuelInLiters < 0) {
                        car.currentFuelInLiters = 0;
                    }
                }
                car.getCurrentFuel();
            }
        }
    }

    private static void handleDriving(Scanner scanner, Cars car) {
        boolean driving = readYesNo(scanner, "does the driver drives the car?? (yes/no): ");
        if (driving) {
            boolean driveTillEmpty = readYesNo(scanner, "does car go all the way until fuel run out? (yes/no): ");
            if (driveTillEmpty) {
                int i = 0;
                while (car.currentFuelInLiters > 0) {
                    car.drive();
                    i++;
                }
                System.out.println("car drove for total of " + i + " units.");

            } else {
                System.out.print("how many units did car drove?? : ");
                float units = scanner.nextFloat();
                scanner.nextLine();
                int i = 0;
                while (car.currentFuelInLiters > 0 && i < units) {
                    car.drive();
                    i++;
                }
                System.out.println("car drove for total of " + i + " units.");
            }
        }
    }

    private static void printCarSummary(Cars car) {
        System.out.println("current speed of car is: " + car.currentSpeed);
        System.out.println();
        System.out.println("current fuel in the car is: " + car.currentFuelInLiters);
        System.out.println();
        System.out.println("Color of the car is: " + car.color);
        System.out.println();
        System.out.println("Fuel type in car is: " + car.fuelType);
        System.out.println();
    }

    private static boolean readYesNo(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("yes");
    }
}