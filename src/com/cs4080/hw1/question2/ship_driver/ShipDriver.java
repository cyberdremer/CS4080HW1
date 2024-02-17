package com.cs4080.hw1.question2.ship_driver;

import com.cs4080.hw1.question2.ship.CargoShip;
import com.cs4080.hw1.question2.ship.CruiseShipClass;
import com.cs4080.hw1.question2.ship.Ship;

public class ShipDriver {
    public static void main(String args[]){
        Ship[] shipGroup = new Ship[3];
        shipGroup[0] = new CargoShip();
        shipGroup[0].setShipName("Cargo Ship");
        shipGroup[1] = new Ship();
        shipGroup[1].setShipName("Ship");
        shipGroup[2] = new CruiseShipClass();
        shipGroup[2].setShipName("Cruise Ship");


        for (int i =0; i < shipGroup.length; i++){
            shipGroup[i].printShipInfo();
        }


    }
}
