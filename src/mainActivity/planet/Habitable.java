package mainActivity.planet;

import mainActivity.ship.Ship;

public interface Habitable {

    public void departVaisseaux();



    default public void accueillirVaisseaux(Ship... ship) {
        System.out.println("Ca marche le default");
    }
}
