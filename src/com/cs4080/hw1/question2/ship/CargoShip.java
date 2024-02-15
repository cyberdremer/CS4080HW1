package com.cs4080.hw1.question2.ship;

public class CargoShip extends Ship{
    private int maxCapacityInTons;

    public CargoShip(){
        super();
        this.maxCapacityInTons = 0;

    }

    /**
     * @param maxCapacityInTons
     *        The max capacity in tons the ship can hold.
     * @param name
     *        Name of the ship
     * @param yearOfManufacturing
     */
    public CargoShip(int maxCapacityInTons, String name, int yearOfManufacturing){
        super(name, yearOfManufacturing);
        this.maxCapacityInTons = maxCapacityInTons;

    }

    public int getMaxCapacityInTons() {
        return maxCapacityInTons;
    }

    public void setMaxCapacityInTons(int maxCapacityInTons) {
        this.maxCapacityInTons = maxCapacityInTons;
    }

    @Override
    public void printShipInfo() {
        System.out.println("Ship name: " + this.shipName +
                "\nShip's max cargo: " + this.maxCapacityInTons);

    }

}
