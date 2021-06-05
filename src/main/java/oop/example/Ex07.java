  
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex07 {
    public static final double conversion = 0.09290304;
    public static void main(String[] args) {

        double len, wid, areaFeet, areaMeters;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the room in feet? ");
        len = scanner.nextInt();

        System.out.println("What is the width of the room in feet? ");
        wid = scanner.nextInt();

        System.out.println("You entered dimensions of " + len + " feet by " + wid + " feet.");

        areaFeet = len * wid;
        areaMeters = areaFeet * conversion;

        System.out.println("The area is");
        System.out.println(areaFeet + " square feet");
        System.out.println(areaMeters + " square meters");

    }
}