package com.vehicle.rental.model;

public abstract class Vehicle {
    private static final String model = null;
    private final double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        Vehicle.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }

    public static String getModel() {
        return model ;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailability(boolean availability) {
        isAvailable = availability;
    }

    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();
}
