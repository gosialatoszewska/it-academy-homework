package com.it.academy.homework6.zoo;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Rhino rhino = new Rhino();


        Animal [] animals = {lion, elephant, rhino};
        Zoo zoo = new Zoo(animals);
        zoo.makeSound();



    }
   }
