import java.util.ArrayList;
import java.util.List;

public class PlanetteTellurique extends Planet implements Habitable {
    String matter;
     int totalSpaceShip = 2;
    List<Ship> dockedShip = new ArrayList<>();


    PlanetteTellurique(String name, String matter, long diametre, Atmosphere atmosphere, int totalSpaceShip ) {
        super(name, diametre, atmosphere);
        this.matter = matter;
        this.totalSpaceShip = totalSpaceShip;
    }

    @Override
    public void departVaisseaux() {
    }

    @Override
    public void accueillirVaisseaux(Ship ship) {
        int spaceActualy = totalSpaceShip - dockedShip.size();
        System.out.println(spaceActualy);
        if (spaceActualy > 0 && spaceActualy >= ship.spaceForDock) {
            dockedShip.add(ship);
            totalVisiter += ship.nbrPassagers;
            System.out.println("Le ship " + ship.type + " arrive.");
        } else {
            System.out.println("Il ny a plus de place.");
        }
    }
}
