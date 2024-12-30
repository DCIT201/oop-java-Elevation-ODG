package com.vehicle.rental.model;

public class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, int cargoCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (cargoCapacity > 5 ? 30 : 0);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable() && cargoCapacity > 2;
    }
}
