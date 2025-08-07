package com.garage;

import com.car.Car;

public class GarageService {

    public boolean addCarToGarage(Car car, Garage garage) {

        Car[] cars = garage.getCars();

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                return true;
            }
        }
        ;

        return false;
    }
}
