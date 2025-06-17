package in.java.abstraction;

public class Car extends vehicle{

    private int noOfDoors;
    public Car() {
        super(4);
    }

    @Override
    public void makeSound() {
        System.out.println("brr.......");
    }
}
