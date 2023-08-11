public class PlanetteTellurique extends Planet implements Habitable {
    String matter;

    PlanetteTellurique(String name, String matter, long diametre, Atmosphere atmosphere) {
        super(name, diametre, atmosphere);
        this.matter = matter;
    }

    @Override
    public void departVaisseaux() {
        Planet.usedSpaceShip -= dockedShip.spaceForDock;
    }

    @Override
    public void accueillirVaisseaux(Ship ship) {
        if (dockedShip != null) {
            departVaisseaux();
            System.out.println("Le ship " + dockedShip.type + " part.");
        }
        if (usedSpaceShip < totalSpaceShip) {
            usedSpaceShip += ship.spaceForDock;
            dockedShip = ship;
            totalVisiter += ship.nbrPassagers;
            System.out.println("Le ship " + ship.type + " arrive.");
        }
    }
}
