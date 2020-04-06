package com.it.academy.homework6.factory;

public class Factory {

    private Worker [] workers;

    public Factory(Worker[] workers) {
        this.workers = workers;
    }

    public void printSalaries() {
        for (Worker worker : workers) {
            System.out.println(worker.getName() + " " + worker.getProffesion() + " " + worker.getSalary());
        }
    }


}
