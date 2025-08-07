package com.car;

public class CarDAO {
    private static Car[] cars;
    public static int nextAvailableSlot = 0;
    public static final int CAPACITY = 100;

    static {
        cars = new Car[CAPACITY];
    }

    public void saveCar(Car car) {
        cars[nextAvailableSlot] = car;
    };
}
