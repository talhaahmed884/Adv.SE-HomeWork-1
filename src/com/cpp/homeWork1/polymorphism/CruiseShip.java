package com.cpp.homeWork1.polymorphism;

/**
 * A CruiseShip class that extends Ship to represent the Name, Built year, and Passenger capacity of a CruiseShip.
 * It extends Ship to represent a different version of a Ship i.e., a CruiseShip.
 */
public class CruiseShip extends Ship {
    private int maxPassengersCapacity;

    /**
     * no-argument constructor of the CruiseShip class.
     */
    public CruiseShip() {
        super();
        this.maxPassengersCapacity = 0;
    }

    /**
     * constructor with all the arguments to initialize and assign values to the variables of the class.
     *
     * @param name, builtYear, and maxPassengersCapacity of a CruiseShip.
     */
    public CruiseShip(String name, String builtYear, int maxPassengersCapacity) {
        super(name, builtYear);
        this.maxPassengersCapacity = maxPassengersCapacity;
    }

    /**
     * getter method to return the max passenger capacity of a CruiseShip.
     *
     * @return maxPassengersCapacity of a CruiseShip.
     */
    public int getMaxPassengersCapacity() {
        return this.maxPassengersCapacity;
    }

    /**
     * setter method to set the max passenger capacity of a CruiseShip.
     *
     * @param maxPassengersCapacity of a CruiseShip.
     */
    public void setMaxPassengersCapacity(int maxPassengersCapacity) {
        this.maxPassengersCapacity = maxPassengersCapacity;
    }

    /**
     * display ship's name, built year, and max passenger capacity on separate lines respectively.
     */
    public void print() {
        System.out.println("Ship name: " + this.getName());
        System.out.println("Ship built year: " + this.getBuiltYear());
        System.out.println("Max Passengers Capacity: " + this.maxPassengersCapacity);
    }
}
