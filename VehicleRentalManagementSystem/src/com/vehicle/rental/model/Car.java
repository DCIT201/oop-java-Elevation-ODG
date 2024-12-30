package com.vehicle.rental.model;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String vehicleId, String model, double baseRentalRate, int numDoors) {
        super(vehicleId, model, baseRentalRate);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (numDoors > 4 ? 10 : 0);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable() && numDoors > 2;
    }
}
