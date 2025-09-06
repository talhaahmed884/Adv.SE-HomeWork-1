package com.cpp.homeWork1.polymorphism;

/**
 * A CargoShip class that extends Ship to represent the Name, Built year, and Cargo capacity of a CargoShip.
 * It extends Ship to represent a different version of a Ship i.e., a CargoShip.
 */
public class CargoShip extends Ship {
    private int maxCargoCapacity;

    /**
     * no-argument constructor of the CargoShip class.
     */
    public CargoShip() {
        super();
        this.maxCargoCapacity = 0;
    }

    /**
     * constructor with all the arguments to initialize and assign values to the variables of the class.
     *
     * @param name, builtYear, and maxCargoCapacity of a CargoShip.
     */
    public CargoShip(String name, String builtYear, int maxCargoCapacity) {
        super(name, builtYear);
        this.maxCargoCapacity = maxCargoCapacity;
    }

    /**
     * getter method to return the max cargo capacity of a CargoShip.
     *
     * @return maxCargoCapacity of a CargoShip.
     */
    public int getCargoCapacity() {
        return maxCargoCapacity;
    }

    /**
     * setter method to set the max cargo capacity of a CargoShip.
     *
     * @param maxCargoCapacity of a CargoShip.
     */
    public void setCargoCapacity(int maxCargoCapacity) {
        this.maxCargoCapacity = maxCargoCapacity;
    }

    /**
     * display ship's name, built year, and max cargo capacity on separate lines respectively.
     */
    public void print() {
        System.out.println("Ship name: " + this.getName());
        System.out.println("Ship built year: " + this.getBuiltYear());
        System.out.printf("Max Cargo Capacity: %d ton\n", this.maxCargoCapacity);
    }
}
