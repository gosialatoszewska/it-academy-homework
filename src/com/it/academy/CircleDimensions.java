package com.it.academy;

import java.util.Scanner;

import static java.lang.Math.*;

public class CircleDimensions {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide Radius");
        double Radius = scanner.nextFloat();
        double Area = Radius * Radius * PI;
        double Perimeter = 2 * Radius * PI;
        System.out.println("Area = " + Area);
        System.out.println("Perimeter = " + Perimeter);
    }



}

