package com.cs4080.hw1.question2.ship;

public class Ship {
    protected String shipName;
    protected int yearOfManufacturing;

    public Ship(){
        shipName = null;
        yearOfManufacturing = 0;
    }

    public Ship(String shipName, int yearOfManufacturing){
        this.shipName = shipName;
        this.yearOfManufacturing = yearOfManufacturing;

    }

    public String getShipName() {
        return shipName;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public void printShipInfo(){
        System.out.println("Name of ship: " + this.shipName +
                "\nYear of manufacturing: " + this.yearOfManufacturing);
    }

}
