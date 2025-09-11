package Qs_2;

import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        Shape shapeObj = new Shape();

        System.out.println("Calculating area of Square");
        System.out.print("Enter value of side: ");
        float side = inputObj.nextFloat();
        float squareArea = shapeObj.calcArea(side);
        System.out.println("Area of Square = " + squareArea);

        System.out.println("\nCalculating area of Rectangle");
        System.out.print("Enter length: ");
        int length = inputObj.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = inputObj.nextInt();
        int rectArea = shapeObj.calcArea(length, breadth);
        System.out.println("Area of Rectangle = " + rectArea);

        System.out.println("\nCalculating area of Triangle");
        System.out.print("Enter base: ");
        float base = inputObj.nextFloat();
        System.out.print("Enter height: ");
        float height = inputObj.nextFloat();
        float triangleArea = shapeObj.calcArea(base, height);
        System.out.println("Area of Triangle = " + triangleArea);

        inputObj.close();
    }
}
