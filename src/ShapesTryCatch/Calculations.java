package ShapesTryCatch;

import java.util.Scanner;

public class Calculations extends Calculator{
    private double length;
    private double width;
    private double side;
    private double radius;

    @Override
    public void setRadius(double radius) {this.radius = radius;}

    @Override
    public void setWidth(double width) {this.width = width;}

    @Override
    public void setLength(double length) {this.length = length;}

    @Override
    public void setSide(double side) {this.side = side;}

    public double AreaCirc(double radius){
        return (Math.PI*radius*radius);
    }

    public double AreaSquare(double side){
        return (side*side);
    }

    public double AreaRect(double length, double width){
        return (length*width);
    }

    @Override
    public void Calculate(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the radius: ");
        setRadius(scanner.nextDouble());

        System.out.print("enter the width: ");
        setWidth(scanner.nextDouble());

        System.out.print("enter the length: ");
        setLength(scanner.nextDouble());

        System.out.print("enter the side: ");
        setSide(scanner.nextDouble());

        try{
            if (radius <=0 || side <=0 || length <=0 || width <= 0){  //Double values can not be null
                System.err.println("invalid input");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        System.out.println("area of circle is: " + AreaCirc(radius) + ".");
        System.out.println("area of square is: " + AreaSquare(side) + ".");
        System.out.println("area of rectangle is: " + AreaRect(length, width) + ".");

    }
}
