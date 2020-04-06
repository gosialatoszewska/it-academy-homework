package com.it.academy.homework6.shapes;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(6);


        Shape[] shapes = {circle, rectangle, square};

        Carpet carpet = new Carpet(shapes);
        System.out.println(carpet.getSize());

    }
}
