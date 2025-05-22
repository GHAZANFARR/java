import java.util.Scanner;

public class Cars { //taking it for an "Instance Variables And Methods" example

     int noOfWheels;

     String color;

     int noOfSeats;

     float currentFuelInLiters;

     float currentSpeed;

     float maxSpeed;

     String fuelType;

     public void drive() {
         if (currentFuelInLiters > 0) {
             System.out.println("The Car is driving");
             currentFuelInLiters--;
         } else System.out.println("Car is out of fuel:(");
     }

     public void addFuel(float posFuel) {
         if (posFuel > 0) {
             currentFuelInLiters += posFuel;
         } else currentFuelInLiters = 0;
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

         System.out.print("enter the Current Fuel Level: ");
         car.currentFuelInLiters = scanner.nextFloat();
         scanner.nextLine();

         System.out.print("enter the Fuel Type: ");
         car.fuelType = scanner.nextLine();
         scanner.nextLine();

         System.out.print("enter the Max Speed of Car: ");
         car.maxSpeed = scanner.nextFloat();
         scanner.nextLine();

         System.out.print("enter the Current Fuel Level: ");
         car.noOfWheels = scanner.nextInt();
         scanner.nextLine();

         System.out.print("enter the Current Fuel Level: ");
         car.noOfSeats = scanner.nextInt();
         scanner.nextLine();

         System.out.print("enter the Current Speed of Car: ");
         car.currentSpeed = scanner.nextFloat();
         scanner.nextLine();

         System.out.print("enter the Number of Wheels of Car: ");
         car.noOfWheels = scanner.nextInt();
         scanner.nextLine();

         System.out.print("enter the Color of Car: ");
         car.color = scanner.nextLine();

         boolean change = false;
         System.out.print("does the speed of car change? (yes/no): ");
         String yesNo = scanner.nextLine();

         if (yesNo.equalsIgnoreCase("yes")) {
             change = true;
         }
         if (change) {
             System.out.print("does speed increase or decrease: ");
             String speedChange = scanner.nextLine();

                if (speedChange.equalsIgnoreCase("increase")) {
                    System.out.print("enter the increment in speed: ");
                    float posSpeed = scanner.nextFloat();
                    car.acceleration(posSpeed);

                } else {
                    System.out.print("enter the decrement in speed: ");
                    float negSpeed = scanner.nextFloat();
                    car.deceleration(negSpeed);
                }

                car.getCurrentSpeed();
         }

         boolean fuelChange = false;
         System.out.print("does the Fuel Levels of car change? (yes/no): ");
         String yesOrNo = scanner.nextLine();

         if (yesOrNo.equalsIgnoreCase("yes")) {
             fuelChange = true;
         }
         if (fuelChange) {
             System.out.print("does fuel increase or decrease: ");
             String fuelChangeInLiters = scanner.nextLine();

             if (fuelChangeInLiters.equalsIgnoreCase("increase")) {
                 System.out.print("enter the incremented in fuel: ");
                 float posFuel = scanner.nextFloat();
                 car.addFuel(posFuel);

             } else {
                 System.out.print("enter the decrement in fuel: ");
                 float negFuel = scanner.nextFloat();
                 car.currentFuelInLiters -= negFuel;
             }

             car.getCurrentFuel();
         }

         System.out.print("does the driver drives the car?? (yes/no): ");
         String driving = scanner.nextLine();

         boolean drive = false;
         if (driving.equalsIgnoreCase("yes")) {
             System.out.println("how many units did car drove?? : ");
             float units = scanner.nextFloat();
             scanner.nextLine();
             for (int i = 0; i < units; i++) {
                 car.drive();
             }
         }

         System.out.println(car.currentSpeed);
         System.out.println(car.currentFuelInLiters);
         System.out.println(car.color);
         System.out.println(car.fuelType);

     }
 }