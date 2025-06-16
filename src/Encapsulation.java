import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Bike{
    private boolean keys;
    private float fuelLevels;

    public void initializeBike(Scanner scanner) {

        this.driverKeys(scanner);
        this.fuelLevels = getFuelLevels(scanner);
    }

    private Boolean driverKeys(Scanner scanner){
        System.out.println("enter your key: (yes/no)");
        this.keys = scanner.nextLine().equalsIgnoreCase("yes");
         return this.keys;
    }

    private float getFuelLevels(Scanner scanner){
        System.out.println("enter the fuel levels: ");
        return scanner.nextFloat();
    }

    private boolean checkFuel(){
        return this.fuelLevels > 0 ? true: false;
    }


    public Boolean bikeStart(){

        return this.keys && checkFuel();
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bike bike = new Bike();

        Boolean bikeBehave = bike.bikeStart();
        String bikeCondition = bikeBehave ? "bike is started" : "bike is at rest";
    }
}
