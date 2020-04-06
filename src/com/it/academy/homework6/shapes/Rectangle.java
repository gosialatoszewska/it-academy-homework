package com.it.academy.homework6.shapes;

public class Rectangle extends Shape {

    private double width;

    private double heigh;

    public Rectangle(double width, double heigh) {
        this.width = width;
        this.heigh = heigh;
    }

    @Override
    double getArea() {

        return width * heigh;
    }
}
