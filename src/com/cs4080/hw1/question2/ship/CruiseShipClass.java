package com.cs4080.hw1.question2.ship;

public class CruiseShipClass extends Ship {
    private int maxPassengers;

    public CruiseShipClass(){
        super();
        maxPassengers = 0;

    }

    /**
     * @param nameOfShip
     * @param yearOfManufacturing
     * @param maxPassengers
     *
     */
    public CruiseShipClass(String nameOfShip, int yearOfManufacturing, int maxPassengers){
        super(nameOfShip, yearOfManufacturing);
        this.maxPassengers = maxPassengers;

    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void printShipInfo(){
        System.out.println("Ship Name: " + this.shipName +
                "\nMax num of passengers: " + this.maxPassengers);

    }


}
