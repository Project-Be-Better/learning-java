package com.garage;

import java.util.Arrays;

import com.car.Car;

public class Garage {
    private int capacity;
    private int number;
    private Car[] cars;

    public Garage(int capacity, int number) {
        this.capacity = capacity;
        this.number = number;
    }

    public Garage(int capacity, int number, Car[] cars) {
        this.capacity = capacity;
        this.number = number;
        this.cars = cars;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Garage [capacity=" + capacity + ", number=" + number + ", cars=" + Arrays.toString(cars) + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + capacity;
        result = prime * result + number;
        result = prime * result + Arrays.hashCode(cars);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Garage other = (Garage) obj;
        if (capacity != other.capacity)
            return false;
        if (number != other.number)
            return false;
        if (!Arrays.equals(cars, other.cars))
            return false;
        return true;
    }
}
