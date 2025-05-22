import java.sql.SQLOutput;
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

     public void addFuel(float fuel) {
         if (fuel > 0) {
             currentFuelInLiters += fuel;
         } else currentFuelInLiters = 0;
     }

     public float getCurrentFuel() {
         System.out.println("current fuel is: " + currentFuelInLiters);
         return currentFuelInLiters;
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

     public float getCurrentSpeed() {
         System.out.println("current speed is: " + currentSpeed);
         return currentSpeed;
     }

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         Cars car = new Cars();

         System.out.println("enter the Current Fuel Level: ");
         car.currentFuelInLiters = scanner.nextFloat();
         scanner.nextLine();

         System.out.println("enter the Current Speed of Car: ");
         car.currentSpeed = scanner.nextFloat();
         scanner.nextLine();

         System.out.println("enter the Number of Wheels of Car: ");
         car.noOfWheels = scanner.nextInt();
         scanner.nextLine();

         System.out.println("enter the Color of Car: ");
         car.color = scanner.nextLine();

         boolean change = false;
         System.out.print("does the speed of car change? (yes/no): ");
         String yesNo = scanner.nextLine();

         if (yesNo.equalsIgnoreCase("yes")) {
             change = true;
         }
         if (change) {
             System.out.println("does speed increase or decrease: ");
             String speedChange = scanner.nextLine();
                if (speedChange.equalsIgnoreCase("increase")) {
                    System.out.println("enter the increment in speed: ");
                    float posSpeed = scanner.nextFloat();
                    car.acceleration(posSpeed);
                } else {
                    System.out.println("enter the decrement in speed: ");
                    float negSpeed = scanner.nextFloat();
                    car.deceleration(negSpeed);
                }
         }
     }
 }