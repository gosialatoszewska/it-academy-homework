package com.it.academy.homework6.shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }
}
