package com.it.academy.homework6.shapes;

public class Carpet {

    private Shape[] shapes;

    double getSize() {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();

        }
        return sum;
    }

    public Carpet(Shape[] shapes) {
        this.shapes = shapes;
    }
}


