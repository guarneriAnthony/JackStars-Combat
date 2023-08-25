package mainActivity.planet;

import mainActivity.ship.Ship;
import java.util.ArrayList;
import java.util.List;

public class PlanetteTellurique extends Planet implements Habitable {
    String matter;
     Ship[] totalSpaceShip;
    int countFreeSpace;
    int countUsedSpace = 0;


    public PlanetteTellurique(String name, String matter, long diametre, Atmosphere atmosphere, int totalSpaceShip, Float distance) {
        super(name, diametre, atmosphere, distance);
        this.matter = matter;
        this.totalSpaceShip = new Ship[totalSpaceShip];
        this.countFreeSpace = totalSpaceShip;
    }

    @Override
    public void departVaisseaux() {
    }


    @Override
    public void accueillirVaisseaux(Ship... ship) {
        for (Ship value : ship) {
            countUsedSpace += value.spaceForDock;
        }

        if (countFreeSpace >= countUsedSpace){
            for (int i = 0; i < ship.length; i++) {
                totalSpaceShip[i]=ship[i];
                countFreeSpace -= ship[i].spaceForDock;
                System.out.println("Le ship " +ship[i].type +" arrive")  ;
            }
        } else {
            System.out.println("Ba ya pu de place hi !");
        }





    }
}
