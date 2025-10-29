package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double originalCost = super.getOriginalCost();
        double currentCost = 0.00;
        int currentYear = LocalDate.now().getYear();
        int vehicleAge = currentYear - year;

        if (vehicleAge <= 3) {
            currentCost = originalCost - (0.03 * originalCost);
        } else if (vehicleAge <= 6) {
            currentCost = originalCost - (0.06 * originalCost);
        } else if (vehicleAge <= 10) {
            currentCost = originalCost - (0.08 * originalCost);
        } else {
            currentCost = 1000.00;
        }

        String carMakeModel = makeModel.toUpperCase();
        if (odometer > 100000 && carMakeModel.contains("Toyota") && carMakeModel.contains("Honda")) {
            originalCost = originalCost * 0.75;
        }
        return originalCost;

    }

    @Override
    public String toString() {
        return "Vehicle Details:\n" +
                "Description: " + getDescription() + "\n" +
                "Date Acquired: " + getDateAcquired() + "\n" +
                "Original Cost: $" + String.format("%.2f", getOriginalCost()) + "\n" +
                "Make & Model: " + makeModel + "\n" +
                "Year: " + year + "\n" +
                "Odometer: " + odometer + " miles";
    }
}
