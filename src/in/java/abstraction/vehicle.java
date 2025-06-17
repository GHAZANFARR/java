package in.java.abstraction;

public abstract class vehicle implements Transport{
    private int noOfTires;

    public abstract void makeSound();

    public vehicle(int noOfTires){
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    @Override
    public void getSetGo() {
        System.out.println("started moving");
    }

    public void commute() {
        System.out.println("going...");
    }
}
