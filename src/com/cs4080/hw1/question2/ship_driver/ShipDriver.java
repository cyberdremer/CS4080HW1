package com.cs4080.hw1.question2.ship_driver;

import com.cs4080.hw1.question2.ship.CargoShip;
import com.cs4080.hw1.question2.ship.CruiseShipClass;
import com.cs4080.hw1.question2.ship.Ship;

public class ShipDriver {
    public static void main(String args[]){
        Ship[] shipGroup = new Ship[3];
        shipGroup[0] = new CargoShip(200, "Cargo Ship", 2000);
        shipGroup[1] = new Ship("Basic Ship" , 1965);
        shipGroup[2] = new CruiseShipClass("Cruise Ship" , 2100, 10000);

        for (int i =0; i < shipGroup.length; i++){
            shipGroup[i].printShipInfo();
        }


    }
}
