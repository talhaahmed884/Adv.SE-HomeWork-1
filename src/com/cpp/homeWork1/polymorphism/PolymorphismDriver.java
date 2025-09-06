package com.cpp.homeWork1.polymorphism;

public class PolymorphismDriver {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Beast I", "1995");
        ships[1] = new CruiseShip("Tyler Cruise I", "2004", 150);
        ships[2] = new CargoShip("Container Travel II", "2020", 1000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}
