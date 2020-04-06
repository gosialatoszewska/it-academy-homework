package com.it.academy.homework6.zoo;

public class Zoo {

    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

public void makeSound() {
        for (Animal animal: animals) {
            animal.makeSound();
        }
}
}
