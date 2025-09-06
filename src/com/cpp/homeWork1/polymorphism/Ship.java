package com.cpp.homeWork1.polymorphism;

/**
 * A Ship class to represent the Name and Built year of a Ship.
 */
public class Ship {
    private String name;
    private String builtYear;

    /**
     * no-argument constructor of the Ship class.
     */
    public Ship() {
        this.name = "";
        this.builtYear = "";
    }

    /**
     * constructor with all the arguments to initialize and assign values to the variables of the class.
     *
     * @param name and builtYear of a Ship.
     */
    public Ship(String name, String builtYear) {
        this.name = name;
        this.builtYear = builtYear;
    }

    /**
     * getter method to return the name of a Ship.
     *
     * @return name of a ship.
     */
    public String getName() {
        return this.name;
    }

    /**
     * setter method to set the name of a ship.
     *
     * @param name of a ship.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter method to return the built year of a Ship.
     *
     * @return builtYear of a ship.
     */
    public String getBuiltYear() {
        return this.builtYear;
    }

    /**
     * setter method to set the built year of a ship.
     *
     * @param builtYear of a ship.
     */
    public void setBuiltYear(String builtYear) {
        this.builtYear = builtYear;
    }

    /**
     * display ship's name and built year on separate lines respectively.
     */
    public void print() {
        System.out.println("Ship name: " + this.name);
        System.out.println("Ship built year: " + this.builtYear);
    }
}
