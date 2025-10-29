package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House() {
    }

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;


    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;

    }

    @Override
    public double getValue() {
        double valuePerSquareFoot;

        switch (condition) {

            case 1: ///Excellent
                valuePerSquareFoot = 180.00;
                break;
            case 2: ///Good
                valuePerSquareFoot = 130.00;
                break;
            case 3: ///Fair
                valuePerSquareFoot = 90.00;
                break;
            case 4: /// poor
                valuePerSquareFoot = 80.00;
                break;
            default:
                valuePerSquareFoot = 0.00;
        }
        double houseValue = valuePerSquareFoot * squareFoot;
        double lotValue = lotSize * 0.25;
        return houseValue + lotValue;

    }

    @Override
    public String toString() {
        return "House Details:\n" +
                "Description: " + getDescription() + "\n" +
                "Date Acquired: " + getDateAcquired() + "\n" +
                "Original Cost: $" + String.format("%.2f", getOriginalCost()) + "\n" +
                "Address: " + address + "\n" +
                "Condition: " + condition + "\n" +
                "Square Footage: " + squareFoot + " sq ft\n" +
                "Lot Size: " + lotSize + " sq ft";
    }
}
