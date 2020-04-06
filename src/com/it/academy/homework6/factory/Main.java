package com.it.academy.homework6.factory;

public class Main {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        Loader loader = new Loader();
        Manager manager = new Manager();

        Worker [] workers = {accountant, loader, manager};
        Factory factory = new Factory(workers);
        factory.printSalaries();



    }


}
