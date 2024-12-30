package com.vehicle.rental.model;

public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, int engineCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (engineCapacity > 650 ? 20 : 0);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable() && engineCapacity > 250;
    }
}

