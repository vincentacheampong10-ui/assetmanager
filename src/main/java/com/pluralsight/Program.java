package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();
        House house = new House("Romell House", "12-10-2026", 00.00, "4585", 1, 90, 90);
        Vehicle vehicle = new Vehicle("Sedan,silver, 4-door", "2010-05-15", 20000.0, "Honda Accord", 2003, 120000);


        assets.add(house);
        assets.add(vehicle);


        for (Asset asset : assets) {
            System.out.println(asset);
            System.out.println();
        }

    }
}
