package Qs_1;

import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Enter length: ");
        float length = inputObj.nextFloat();

        System.out.print("Enter width: ");
        float width = inputObj.nextFloat();

        System.out.print("Enter height: ");
        float height = inputObj.nextFloat();

        inputObj.close();

        Room myRoom = new Room(length, width, height);
        System.out.println("Surface Area = " + myRoom.calculateSurfaceArea());
        System.out.println("Volume = " + myRoom.calculateVolume());
    }
}
