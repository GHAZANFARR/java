package area;

import java.util.Scanner;

public class calculations extends Shape{
    private double side;
    private double radius;

    @Override
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getRadius(){
        return radius;
    }

    @Override
    public void setSide(double side){
        this.side = side;
    }

    @Override
    public double getSide(){
        return side;
    }

    public static class squareArea{
         private static double areaSq(double side){
             return side*side;
         }
    }

    public static class circleArea{
         private static double areaCir(double radius){
             return Math.PI*radius*radius;
         }
    }

    @Override
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the radius of circle(in cm): ");
        double radius = scanner.nextDouble();
        setRadius(radius);

        System.out.print("enter the side of square(in cm): ");
        double side = scanner.nextDouble();
        setSide(side);

        System.out.println("Area is: " + circleArea.areaCir(radius) + "cm\u00B2"); //is code
        System.out.println("Area is: " + squareArea.areaSq(side) + "cm\u00B2");
    }
}
