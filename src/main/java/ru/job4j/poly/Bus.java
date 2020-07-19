package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Passenger: " + passenger);

    }

    @Override
    public double fuel(int value) {
        return value * 1.69;
    }
}
